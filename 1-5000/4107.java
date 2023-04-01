import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			if(n == 0) {
				break;
			}
			
			int[] arr = new int[k];
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < k; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			long answer = 0, c = n;
			for(int i = 0; i < m; i++) {
				answer += c;
				c += arr[i % k];
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
