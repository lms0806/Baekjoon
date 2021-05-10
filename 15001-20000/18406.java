import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s = br.readLine();
		
		int a = 0, b = 0;
		for(int i = 0; i < s.length()/2; i++) {
			a += (int)s.charAt(i);
			b += (int)s.charAt(s.length()-i-1);
		}
		
		System.out.println(a == b ? "LUCKY" : "READY");
	}
}
