import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(solve(Integer.parseInt(br.readLine()), br.readLine()));
	}
	
	public static String solve(int n, String s) {
		if(n < s.length()) {
			return "Impossible";
		}
		
		int answer = 0;
		for(char c : s.toCharArray()) {
			answer += c - 'a' + 1;
		}
		return answer + "";
	}
}
