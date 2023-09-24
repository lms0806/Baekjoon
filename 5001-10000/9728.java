import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= size; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken()), num = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[n];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			int answer = 0;
			int s = 0, e = n - 1;
			while(s <= e) {
				int sum = arr[s] + arr[e];
				
				if(sum == num) {
					s++;
					e--;
					answer++;
				}
				else if(sum < num) {
					s++;
				}
				else {
					e--;
				}
			}
			sb.append("Case #").append(t).append(": ").append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
