import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		System.out.print(solve(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
	}
	
	public static long solve(int n, int p) {
		long answer = 1;
		
		if(n == p-1) {
			return n;
		}
		for(int i = 1; i <= n; i++) {
			answer = answer * i % p;
		}
		return answer;
	}
}
