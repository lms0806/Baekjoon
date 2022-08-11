import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = change(st.nextToken());
			int t1 = change(st.nextToken()), t2 = change(st.nextToken()), t3 = change(st.nextToken());
			
			if(n == 0 && t1 == 0 && t2 == 0 && t3 == 0) {
				break;
			}
			
			sb.append(4 * n - 1 + 2 * t2 - t1 + (t1 < t2 ? 0 : n) - t3 + (t2 > t3 ? 0 : n)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int change(String s) {
		return Integer.parseInt(s);
	}
}
