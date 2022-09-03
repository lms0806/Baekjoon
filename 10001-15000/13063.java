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
			int m = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
			
			if(n == 0 && m == 0 && k == 0) {
				break;
			}
			
			int answer = -1;
			if(m > n - m) {
				answer = 0;
			}
			else {
				int num = n - m - k;
				for(int i = 1; i <= num; i++) {
					if(i + m > n - m - i) {
						answer = i;
						break;
					}
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
