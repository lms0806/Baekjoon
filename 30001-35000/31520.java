import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(solve(br.readLine()));
	}
	
	public static int solve(String s) {
		int idx = 1;
		for(char c : s.toCharArray()) {
			if(c - '0' != idx++) {
				return -1;
			}
		}
		return s.length();
	}
}
