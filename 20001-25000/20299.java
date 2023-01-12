import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken());
	
		int answer = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
			
			if(a >= l && b >= l && c >= l && a + b + c >= k) {
				sb.append(a).append(" ").append(b).append(" ").append(c).append(" ");
				answer++;
			}
		}
		System.out.print(answer + "\n" + sb);
	}
}
