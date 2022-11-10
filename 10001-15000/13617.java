import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			boolean flag = true;
			for(int i = 0; i < m; i++) {
				if(Integer.parseInt(st.nextToken()) == 0) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
