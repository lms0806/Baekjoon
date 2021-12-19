import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		System.out.print(solve(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
	}
	
	public static int solve(int a, int b, int c) {
		if(a == b && b == c) {
			return 10000 + a * 1000;
		}
		else if(a == b) {
			return 1000 + a * 100;
		}
		else if(b == c) {
			return 1000 + b * 100;
		}
		else if(a == c) {
			return 1000 + c * 100;
		}
		else {
			if(a > b && a > c) {
				return a * 100;
			}
			return Math.max(b, c) * 100;
		}
	}
}
