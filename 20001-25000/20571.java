import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		System.out.print(solve(st.nextToken(), Integer.parseInt(st.nextToken())));
	}
	
	public static int solve(String s, int n) {
		if(n == 1) {
			return 0;
		}
		
		if(s.equals("residential")) {
			if(n >= 2 && n <= 5) {
				return 1;
			}
			else if(n >= 6 && n <= 10) {
				return 2;
			}
			else if(n >= 11 && n <= 15) {
				return 3;
			}
			else {
				return 4;
			}
		}
		else if(s.equals("commercial")) {
			if(n >= 2 && n <= 7) {
				return 1;
			}
			else if(n >= 8 && n <= 14) {
				return 2;
			}
			else {
				return 3;
			}
		}
		else {
			if(n >= 2 && n <= 4) {
				return 1;
			}
			else if(n >= 5 && n <= 8) {
				return 2;
			}
			else if(n >= 9 && n <= 12) {
				return 3;
			}
			else if(n >= 13 && n <= 16) {
				return 4;
			}
			else {
				return 5;
			}
		}
	}
}
