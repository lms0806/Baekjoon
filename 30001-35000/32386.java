import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		HashMap<String, Integer> map = new HashMap<>();
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			st.nextToken();
			st.nextToken();
			
			while(st.hasMoreTokens()) {
				String s = st.nextToken();
				map.put(s, map.getOrDefault(s, 0) + 1);
			}
		}
		
		int max = 0;
		String answer = "-1";
		for(String key : map.keySet()) {
			if(max == map.get(key)) {
				answer = "-1";
			}
			else if(max < map.get(key)) {
				max = map.get(key);
				answer = key;
			}
		}
		System.out.print(answer);
	}
}
