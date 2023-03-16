import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			System.gc();
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[n];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			int s = 0, e = n - 1;
			int answer = 0, min = Integer.MAX_VALUE;
			while(s < e) {
				int sum = arr[s] + arr[e];
				
				if(sum == k) {
					e--;
					s++;
				}
				else if(k < sum) {
					e--;
				}
				else {
					s++;
				}
				
				if(Math.abs(k - sum) < min) {
					min = Math.abs(k - sum);
					answer = 1;
				}
				else if(Math.abs(k - sum) == min) {
					answer++;
				}
			}
			
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
