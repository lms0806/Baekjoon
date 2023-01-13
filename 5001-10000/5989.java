import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		
		boolean[][] shap = new boolean[n + 1][m + 1];
		
		int answer = 0;
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
			
			for(int i = a; i <= c; i++) {
				for(int j = b; j <= d; j++) {
					if(!shap[i][j]) {
						answer++;
					}
					shap[i][j] = true;
				}
			}
		}
		System.out.print(answer);
	}
}
