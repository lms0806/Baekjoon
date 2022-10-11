import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = solve(st.nextToken()), b = solve(st.nextToken());
		
		System.out.print(a > b ? 1 : a < b ? 2 : 0);
	}
	
	public static int solve(String s) {
		int sum = 0;
		for(char c : s.toCharArray()) {
			sum += c - '0';
		}
		
		return s.length() * sum;
	}
}
