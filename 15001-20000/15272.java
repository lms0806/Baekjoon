import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(solve(br.readLine()));
	}
	
	public static String solve(String s) {
		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i) == s.charAt(i - 1) && s.charAt(i) == 's') {
				return "hiss";
			}
		}
		return "no hiss";
	}
}
