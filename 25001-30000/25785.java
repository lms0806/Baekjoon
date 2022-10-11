import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.print(solve(br.readLine()));
	}
	
	public static int solve(String s) {
		int flag = -1;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				if(flag == 1) {
					return 0;
				}
				flag = 1;
			}
			else {
				if(flag == 0) {
					return 0;
				}
				flag = 0;
			}
		}
		return 1;
	}
}
