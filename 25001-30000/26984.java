import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		String[] a = new String[n], b = new String[m];
		boolean[] visited = new boolean[m];
		
		for(int i = 0; i < n; i++) {
			a[i] = br.readLine();
		}
		for(int i = 0; i < m; i++) {
			b[i] = br.readLine();
		}
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(!visited[j] && a[i].startsWith(b[j])) {
					visited[j] = true;
					answer++;
				}
			}
		}
		System.out.print(answer);
	}
}
