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
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
			
			if(a == 0 && b == 0 && c == 0) {
				break;
			}
			
			sb.append((c - a) % b == 0 && (c - a) / b >= 0 ? (c - a) / b + 1 : "X").append("\n");
		}
		System.out.print(sb);
	}
}
