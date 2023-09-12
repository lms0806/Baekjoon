import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String[] s = br.readLine().split("-");
		
		int y = Integer.parseInt(s[0]), m = Integer.parseInt(s[1]), d = Integer.parseInt(s[2]) + Integer.parseInt(br.readLine());
		
		while(d > 30) {
			d -= 30;
			m++;
		}
		
		while(m > 12) {
			m -= 12;
			y++;
		}
		
		System.out.print(y + "-" + print(m) + "-" + print(d));
	}
	
	public static String print(Integer n) {
		return String.format("%02d", n);
	}
} 
