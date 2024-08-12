import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			long n = Long.parseLong(br.readLine());
			
			sb.append(solve(n)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(long n) {
		for(int i = 2; i < 1000001; i++) {
			if(n % i == 0) {
				return "NO";
			}
		}
		return "YES";
	}
}
