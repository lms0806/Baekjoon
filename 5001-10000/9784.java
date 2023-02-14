import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int testcase = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= testcase; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[n];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			int answer = 0, sum = 0;
			for(int i = 0; i < Math.min(n, p); i++) {
				if(sum + arr[i] <= q) {
					sum += arr[i];
					answer++;
				}
				else {
					break;
				}
			}
			
			sb.append("Case ").append(t).append(": ").append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
