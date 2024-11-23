import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
			
			if(n + l + r == 0) {
				break;
			}
			
			int[] arr = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			
			int answer = 0;
			for(int i = l; i <= r; i++) {
				boolean flag = false;
				for(int j = 0; j < n; j++) {
					if(i % arr[j] == 0) {
						flag = true;
						if(j % 2 == 0) {
							answer++;
						}
						break;
					}
				}
				
				if(!flag && n % 2 == 0) {
					answer++;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
