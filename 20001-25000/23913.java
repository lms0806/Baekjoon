import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= test; t++) {
			int n = Integer.parseInt(br.readLine());
			
			int[] arr = new int[n + 1];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int count = 1, answer = 1, min = arr[1] - arr[0];
			for(int i = 1; i < n; i++) {
				if(arr[i] - arr[i - 1] == min) {
					answer = Math.max(answer, ++count);
				}
				else {
					min = arr[i] - arr[i - 1];
					count = 2;
				}
			}
			sb.append(String.format("Case #%d: %d\n", t, Math.max(answer, count)));
		}
		System.out.print(sb);
	}
}
