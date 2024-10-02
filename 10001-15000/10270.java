import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			sb.append(fact(Integer.parseInt(br.readLine())) - 1).append("\n");
		}
		System.out.print(sb);
	}
	
	public static long fact(int n) {
		long num = 1;
		for(int i = 2; i <= n; i++) {
			num *= i;
			num %= 1000000007;
		}
		return num;
	}
}
