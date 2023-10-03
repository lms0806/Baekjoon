import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= size; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken());
			
			int answer = k < s ? s - k : k - s < s ? k - s : s;
			
			answer += n - s + k;
			
			sb.append("Case #").append(t).append(": ").append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
