import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		int h = 0, m = 0, s = 0;
		while(t --> 0) {
			String[] str = br.readLine().split(":");
			
			m += Integer.parseInt(str[0]);
			s += Integer.parseInt(str[1]);
			
			if(s >= 60) {
				s -= 60;
				m++;
			}
			if(m >= 60) {
				m -= 60;
				h++;
			}
		}
		
		System.out.print(print(h) + ":" + print(m) + ":" + print(s));
	}
	
	public static String print(int s) {
		return String.format("%02d", s);
	}
}
