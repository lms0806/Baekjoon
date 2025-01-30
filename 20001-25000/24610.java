import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		int[] arr = new int[m];
		for(int i = 0; i < m; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			
			sum += arr[i];
		}
		
		int idx = 0;
		int[] answer = new int[m];
		while(n > 0 && sum > 0) {
			if(arr[idx] > 0) {
				answer[idx]++;
				arr[idx]--;
				sum--;
				n--;
			}
			
			if(++idx == m) {
				idx = 0;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int a : answer) {
			sb.append(a).append("\n");
		}
		System.out.print(sb);
	}
}
