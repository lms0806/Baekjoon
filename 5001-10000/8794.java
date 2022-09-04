import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken());
			
			n -= (m - l + 1);
			int answer = n / m;
			if(n % m != 0) {
				answer++;
			}
			if(l == 1) {
				answer++;
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
