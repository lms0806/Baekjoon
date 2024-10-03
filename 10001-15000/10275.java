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
			long num = Math.max(Long.parseLong(st.nextToken()), Long.parseLong(st.nextToken()));
			
			int answer = n;
			long value = 1;
			while((num & value) == 0) {
				value <<= 1;
				answer--;
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
