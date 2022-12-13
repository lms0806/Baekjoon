import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			String answer = "Good";
			for(int i = 1; i < n; i++) {
				if(arr[i] < arr[i - 1] * 2) {
					answer = "Bad";
					break;
				}
			}
			
			sb.append("Denominations: ");
			for(int a : arr) {
				sb.append(a).append(" ");
			}
			sb.append("\n").append(answer).append(" coin denominations!").append("\n\n");
		}
		System.out.print(sb);
	}
}
