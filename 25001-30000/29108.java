import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.print(solve(br.readLine()) ? "Correct" : "Incorrect");
	}
	
	public static boolean solve(String s) {
		if(s.length() < 3 || !s.startsWith("io")) {
			return false;
		}
		
		for(int i = 2; i < s.length(); i++) {
			if(s.charAt(i) < '0' || s.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}
}
