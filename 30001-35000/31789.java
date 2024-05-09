import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken());
		
		boolean flag = false;
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			
			if(Integer.parseInt(st.nextToken()) <= x && Integer.parseInt(st.nextToken()) > s) {
				flag = true;
				break;
			}
		}
		System.out.print(flag ? "YES" : "NO");
	}
}
