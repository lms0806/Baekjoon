import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		HashMap<String, String> map = new HashMap<>();
		HashMap<String, Integer> count = new HashMap<>();
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String str = st.nextToken();
			
			if(str.equals("-")) {
				continue;
			}
			
			map.put(name, str);
			count.put(str, count.getOrDefault(str, 0) + 1);
		}
		
		int answer = 0;
		HashSet<String> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		for(String key : map.keySet()) {
			if(set.contains(key)) {
				continue;
			}
			
			for(String key2 : map.keySet()) {
				if(set.contains(key2) || key.equals(key2)) {
					continue;
				}
				
				if(map.get(key).equals(map.get(key2)) && count.get(map.get(key)) == 2) {
					sb.append(key).append(" ").append(key2).append("\n");
					set.add(key);
					set.add(key2);
					answer++;
				}
			}
		}
		System.out.print(answer + "\n" + sb);
	}
}
