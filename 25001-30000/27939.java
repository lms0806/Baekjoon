import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		boolean[] pw = new boolean[n + 1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			pw[i] = st.nextToken().charAt(0) == 'P' ? false : true;
		}
		
		st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		String answer = "P";
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			
			boolean check = pw[Integer.parseInt(st.nextToken())];
			for(int i = 1; i < k; i++) {
				check &= pw[Integer.parseInt(st.nextToken())];
			}
			
			if(check) {
				answer = "W";
				break;
			}
		}
		System.out.print(answer);
	}
}
