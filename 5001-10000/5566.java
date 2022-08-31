import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int[] dice = new int[m];
		for(int i = 0; i < m; i++) {
			dice[i] = Integer.parseInt(br.readLine());
		}
		
		int idx = 0, answer = 0;
		for(int i = 0; i < m; i++) {
			idx += dice[i];
			if(idx >= n - 1) {
				answer = i + 1;
				break;
			}
			
			idx += arr[idx];
			if(idx >= n - 1) {
				answer = i + 1;
				break;
			}
		}
		
		System.out.print(answer);
	}
}
