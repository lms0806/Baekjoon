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
			
			int l = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			
			int left = (s - l) * 2, right = (r - s - 1) * 2 + 1;
			
			sb.append(left < right ? left + 1 : right + 1).append("\n");
		}
		System.out.print(sb);
	}
}
