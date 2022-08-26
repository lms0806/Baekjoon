import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 4; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = change(st.nextToken()), y1 = change(st.nextToken());
			int x2 = change(st.nextToken()), y2 = change(st.nextToken());
			int x3 = change(st.nextToken()), y3 = change(st.nextToken());
			int x4 = change(st.nextToken()), y4 = change(st.nextToken());
			
			if(x2 < x3 || x4 < x1 || y1 > y4 || y2 < y3) {
				sb.append("d");
			}
			else if(x1 == x4 || x3 == x2) {
				if(y2 == y3 || y4 == y1) {
					sb.append("c");
				}
				else {
					sb.append("b");
				}
			}
			else if(y2 == y3 || y4 == y1) {
				sb.append("b");
			}
			else {
				sb.append("a");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	public static int change(String s) {
		return Integer.parseInt(s);
	}
}
