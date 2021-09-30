import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[] num = new int[n];
		for(int i = 0; i < n; i++) {
			num[i] = i + 1;
		}
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken());
			
			int[] num1 = num.clone();
			
			for(int i = a; i < b; i++) {
				num1[i] = num[b - i + a - 1];
			}
			
			num = num1.clone();
		}
		
		StringBuilder sb = new StringBuilder();
		for(int ans : num) {
			sb.append(ans).append(" ");
		}
		System.out.print(sb);
	}
}
