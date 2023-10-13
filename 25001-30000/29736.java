import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		for(int i = k - x; i < k + x + 1; i++) {
			if(i < a || i > b) {
				continue;
			}
			
			answer++;
		}
		
		System.out.print(answer == 0 ? "IMPOSSIBLE" : answer);
	}
}
