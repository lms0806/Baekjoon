import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = 1;
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken()), i = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			if(p == -1 && e == -1 && i == -1 && d == -1) {
				break;
			}
			
			p = (p + (23 * 16 - d)) % 23;
			e = (e + (28 * 14 - d)) % 28;
			i = (i + (33 * 12 - d)) % 33;
			
			int[] visited = new int[21253];
			
			for(int idx = p; idx < 21253; idx += 23) {
				visited[idx]++;
			}
			for(int idx = e; idx < 21253; idx += 28) {
				visited[idx]++;
			}
			for(int idx = i; idx < 21253; idx += 33) {
				visited[idx]++;
			}
			
			int answer = 1;
			for(int idx = 1; idx < 21253; idx++) {
				if(visited[idx] == 3) {
					answer = idx;
					break;
				}
			}
			
			sb.append("Case ").append(t++).append(": the next triple peak occurs in ").append(answer).append(" days.\n");
		}
		System.out.print(sb);
	}
}
