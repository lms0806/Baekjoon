import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		System.out.print(solve(br.readLine()));
	}
	
	public static String solve(String s) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'P') {
				count++;
				continue;
			}
			
			if(count >= 2 && i < s.length() - 1 && s.charAt(i + 1) == 'P') {
				count--;
				i++;
			}
			else {
				return "NP";
			}
		}
		return count == 1 ? "PPAP" : "NP";
	}
}
