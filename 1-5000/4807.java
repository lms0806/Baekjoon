import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = 1;
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			int[] arr = new int[n];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int answer = 0;
			int[] num = new int[n];
			while(true) {
				HashSet<Integer> set = new HashSet<>();
				for(int i = 0; i < n; i++) {
					set.add(arr[i]);
				}
				
				if(set.size() == 1) {
					break;
				}
				
				for(int i = 0; i < n - 1; i++) {
					num[i] = Math.abs(arr[i] - arr[i + 1]);
				}
				num[n - 1] = Math.abs(arr[n - 1] - arr[0]);
				
				for(int i = 0; i < n; i++) {
					arr[i] = num[i];
				}
				
				if(++answer == 1000) {
					break;
				}
			}
			
			sb.append("Case ").append(t).append(": ");
			if(answer == 1000) {
				sb.append("not attained");
			}
			else {
				sb.append(answer).append(" iterations");
			}
			sb.append("\n");
			
			t++;
		}
		System.out.print(sb);
	}
}
