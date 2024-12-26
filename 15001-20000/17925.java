import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		TreeMap<String, Integer> countMap = new TreeMap<>();
		HashMap<String, HashSet<String>> map = new HashMap<>();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String key = st.nextToken();
			map.put(key, new HashSet<>());
			countMap.put(key, 0);
			
			int count = Integer.parseInt(st.nextToken());
			while(count --> 0) {
				map.get(key).add(st.nextToken());
			}
		}
		
		int max = 0;
		String str;
		while((str = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(str);
			while(st.hasMoreTokens()) {
				String s = st.nextToken();
				
				for(String key : map.keySet()) {
					if(map.get(key).contains(s)) {
						countMap.put(key, countMap.getOrDefault(key, 0) + 1);
						max = Math.max(max, countMap.get(key));
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(String key : countMap.keySet()) {
			if(countMap.get(key) == max) {
				sb.append(key).append("\n");
			}
		}
		System.out.print(sb);
	}
}
