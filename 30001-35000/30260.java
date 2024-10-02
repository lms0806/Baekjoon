import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= test; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int l = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[n + 1];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 1; i <= n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int answer = 1;
			while(arr[l] != 0) {
				l = arr[l];
				answer++;
			}
			sb.append("Data Set ").append(t).append(":\n").append(answer).append("\n\n");
		}
		System.out.print(sb);
	}
}
