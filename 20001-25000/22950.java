import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		br.readLine();
		System.out.print(solve(br.readLine(), Integer.parseInt(br.readLine())));
	}
	
	public static String solve(String s, int k) {
		if(!s.contains("1") || k == 0) {
			return "YES";
		}
		
		int count = 0;
		for(int i = s.length() - 1; i >= 0; i--) {
			if(s.charAt(i) == '0') {
				count++;
			}
			else {
				break;
			}
		}
		
		if(count >= k) {
			return "YES";
		}
		return "NO";
	}
}
