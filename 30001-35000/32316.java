import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
		
		boolean[][] arr = new boolean[n + 1][4];
		
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			
			arr[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = true;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n; i++) {
			if(arr[i][1] && arr[i][2]) {
				sb.append(i).append("\n");
			}
		}
		System.out.print(sb);
	}
}
