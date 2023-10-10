import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		st.nextToken();
		int p = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		while(s --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int t = Integer.parseInt(st.nextToken());
			
			boolean flag = false;
			while(t --> 0) {
				if(Integer.parseInt(st.nextToken()) == p) {
					flag = true;
					break;
				}
			}
			
			sb.append(flag ? "KEEP" : "REMOVE").append("\n");
		}
		System.out.print(sb);
	}
}
