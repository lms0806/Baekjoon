import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			
			boolean flag = true;
			for(int i = 0; i < n; i++) {
				if(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) != n) {
					flag = false;
					break;
				}
			}
			
			sb.append(flag ? "no" : "yes").append("\n");
		}
		System.out.print(sb);
	}	
}
