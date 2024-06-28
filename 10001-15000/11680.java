import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n + m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr[i + j]++;
			}
		}
		
		int num = Math.min(n, m);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				sb.append(i + 2).append("\n");
			}
		}
		System.out.print(sb);
	}
}
