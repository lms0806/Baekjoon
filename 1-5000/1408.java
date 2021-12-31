import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String[] str = br.readLine().split(":");
		int h = Integer.parseInt(str[0]), m = Integer.parseInt(str[1]), s = Integer.parseInt(str[2]);
		
		str = br.readLine().split(":");
		int h1 = Integer.parseInt(str[0]) + 24 - h, m1 = Integer.parseInt(str[1]) - m, s1 = Integer.parseInt(str[2]) - s;
		
		if(s1 < 0) {
			m1--;
			s1 += 60;
		}
		
		if(m1 < 0) {
			h1--;
			m1 += 60;
		}
		
		if(h1 >= 24) {
			h1 -= 24;
		}
		
		System.out.print(String.format("%02d", h1) + ":" + String.format("%02d", m1) + ":" + String.format("%02d", s1));
	}
}
