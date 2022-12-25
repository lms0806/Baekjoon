import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		long k = Long.parseLong(st.nextToken());
		
		int[] answer = new int[n + 1];
		
		int start = 1, end = n;
		for(int i = 1; i <= n; i++) {
			if(k >= n - i) {
				k -= (n - i);
				answer[i] = end--;
			}
			else {
				answer[i] = start++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		if(k != 0 || start <= end) {
			sb.append(-1);
		}
		else {
			for(int i = 1; i <= n; i++) {
				sb.append(answer[i]).append(" ");
			}
		}
		System.out.print(sb);
	}
}
