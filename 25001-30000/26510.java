import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(st.hasMoreTokens()) {
			int n = Integer.parseInt(st.nextToken());
			
			for(int i = 0; i < n - 1; i++) {
				sb.append(" ".repeat(i)).append("*").append(" ".repeat(2 * (n - i - 1) - 1)).append("*\n");
			}
			sb.append(" ".repeat(n - 1)).append("*\n");
		}
		System.out.print(sb);
	}
}
