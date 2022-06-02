import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.print(solve(br.readLine()));
	}
	
	public static String solve(String s) {
		for(int i = s.length() - 1; i >= 0; i--) {
			for(char c : "aeiou".toCharArray()) {
				if(c == s.charAt(i)) {
					return s.substring(0, i + 1) + "ntry";
				}
			}
		}
		return s;
	}
}
