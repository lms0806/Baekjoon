import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.print(solve(br.readLine()));
	}
	
	public static String solve(String s) {
		for(int i = 0; i < s.length(); i++) {
			for(int j = 2; j <= s.length() - i; j += 2) {
				String str = s.substring(i, i + j);
				if(str.equals(new StringBuilder(str).reverse().toString())) {
					return "Or not.";
				}
			}
		}
		return "Odd.";
	}
}
