import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		HashMap<String, Integer> count = new HashMap<>();
		LinkedHashMap<String, ArrayList<String>> map = new LinkedHashMap<>();
		while((s = br.readLine()) != null) {
			map.put(s, new ArrayList<>());
			
			for(int i = 1; i <= s.length(); i++) {
				String str = s.substring(0, i);
				
				map.get(s).add(str);
				count.put(str, count.getOrDefault(str, 0) + 1);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(String key : map.keySet()) {
			boolean flag = false;
			for(String value : map.get(key)) {
				if(count.get(value) == 1) {
					flag = true;
					sb.append(key).append(" ").append(value).append("\n");
					break;
				}
			}
			
			if(!flag) {
				sb.append(key).append(" ").append(key).append("\n");
			}
		}
		System.out.print(sb);
	}
}
