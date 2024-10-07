import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			map.put(st.nextToken(), i);
		}
		
		int max = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			String s = st.nextToken();
			
			map.put(s, map.get(s) - i);
			
			max = Math.max(max, map.get(s));
		}
		
		StringBuilder sb = new StringBuilder();
		for(String key : map.keySet()) {
			if(map.get(key) == max) {
				sb.append(key).append(" ");
			}
		}
		System.out.print(sb);
	}
}
