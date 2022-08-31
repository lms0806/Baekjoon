import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		String[][] arr = new String[n][n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				arr[i][j] = st.nextToken();
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			StringBuilder sbs = new StringBuilder();
			for(int j = 0; j < n; j++) {
				sbs.append((arr[i][j] + " ").repeat(k));
			}
			for(int j = 0; j < k; j++) {
				sb.append(sbs).append("\n");
			}
		}
		System.out.print(sb);
		
	}
}
