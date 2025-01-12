import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] sum = new int[n + 2];
		sum[1] = 1;
		
		StringBuilder sb = new StringBuilder();
		for(int i = 2; i <= n + 1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int choice = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken()) - 1, y = Integer.parseInt(st.nextToken());
			
			int answer = sum[y] - sum[x];
			
			sum[i] = sum[i - 1];
			if((choice == 1 && answer == y - x) || (choice == 2 && answer == 0)) {
				sum[i]++;
				sb.append("Yes");
			}
			else {
				sb.append("No");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
