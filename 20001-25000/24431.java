import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
	
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken()), f = Integer.parseInt(st.nextToken());
			
			String[] s = new String[n];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				s[i] = st.nextToken().substring(l - f);
			}
			
			HashMap<String, Integer> map = new HashMap<>();
			
			for(int i = 0; i < n; i++) {
				map.put(s[i], map.getOrDefault(s[i], 0) + 1);
			}
			
			int answer = 0;
			for(String key : map.keySet()) {
				answer += map.get(key) / 2;
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
