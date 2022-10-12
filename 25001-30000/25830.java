import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 5); 
		
		String[] str = br.readLine().split(":");
		
		int h = Integer.parseInt(str[0]), m = Integer.parseInt(str[1]) - Integer.parseInt(str[0]), s = -Integer.parseInt(str[1]);
		
		if(s < 0) {
			m--;
			s += 60;
		}
		
		if(m < 0) {
			h--;
			m += 60;
		}
		
		System.out.print(print(h) + ":" + print(m) + ":" + print(s));
	}
	
	public static String print(int n) {
		return String.format("%02d", n);
	}
}
