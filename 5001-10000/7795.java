import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			int[] a = new int[n], b = new int[m];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < m; i++) {
				b[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(b);
			
			int answer = 0;
			for(int num : a) {
				int start = 0, end = m - 1, result = 0;
				while(start <= end) {
					int mid = (start + end) / 2;
					
					if(b[mid] >= num) {
						end = mid - 1;
					}
					else {
						start = mid + 1;
						result = start;
					}
				}
				answer += result;
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
