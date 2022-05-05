import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				if((i + j) * 2 >= p) {
					answer += (n - i + 1) * (m - j + 1);
				}
			}
		}
		System.out.print(answer);
	}
}
