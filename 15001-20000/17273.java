import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[][] num = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			num[i][0] = Integer.parseInt(st.nextToken());
			num[i][1] = Integer.parseInt(st.nextToken());
		}
		
		while(m --> 0) {
			int k = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < n; i++) {
				if(num[i][0] < k) {
					int temp = num[i][0];
					num[i][0] = num[i][1];
					num[i][1] = temp;
				}
			}
		}
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			answer += num[i][0];
		}
		System.out.print(answer);
	}
}
