import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			
			int[] num = new int[9];
			
			for(int i = 0; i < n; i++) {
				st.nextToken();
				num[Integer.parseInt(st.nextToken())]++;
			}
			
			int answer = 0;
			for(int i = 1; i < 9; i++) {
				answer = Math.max(answer, num[i]);
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
