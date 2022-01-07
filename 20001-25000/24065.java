import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken()), a = Integer.parseInt(st.nextToken());
			
			long answer = 0;
			for(int i = 1; i < n; i++) {
				for(int j = 0; j < i; j++) {
					if(j * j + (i - j) * (i - j) >= a) {
						answer += (n - i) * (n - i); 
					}
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
