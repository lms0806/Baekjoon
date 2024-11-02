import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			int[] arr = new int[n + 1];
			
			for(int i = 1; i <= n; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			
			int answer = 1, num = arr[1];
			while(num != n && answer <= n) {
				num = arr[num];
				answer++;
			}
			sb.append(answer > n ? 0 : answer).append("\n");
		}
		System.out.print(sb);
	}
}
