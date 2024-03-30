import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= test; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[n], sort = new int[n];
			for(int i = 0; i < n; i++) {
				sort[i] = arr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(sort);
			
			int answer = 0;
			for(int i = 0; i < n; i++) {
				int idx = 0;
				for(int j = i; j < n; j++) {
					if(arr[j] == sort[i]) {
						idx = j;
						break;
					}
				}
				
				if(idx == i) {
					continue;
				}
				
				answer += idx - i;
				
				for(int j = idx; j > 0; j--) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
			sb.append("Scenario #").append(t).append(":\n").append(answer).append("\n\n");
		}
		System.out.print(sb);
	}
}
