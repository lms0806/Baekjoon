import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> map = new HashMap<>();
		while(n --> 0) {
			map.put(br.readLine(), n);
		}
		
		StringBuilder sb = new StringBuilder();
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			sb.append(Math.abs(map.get(st.nextToken()) - map.get(st.nextToken())) - 1).append("\n");
		}
		System.out.print(sb);
	}
}
