import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		System.out.print(solve(br.readLine()));
	}
	
	public static String solve(String s) {
		for(int i = 1; i <= s.length() / 2; i++) {
			if(s.replaceAll(s.substring(0, i), "").equals("")) {
				return "Yes";
			}
		}
		return "No";
	}
}
