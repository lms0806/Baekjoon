import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		TreeMap<String, Integer> map = new TreeMap<>();
		
		while(true) {
			String s = br.readLine();
			
			if("------".equals(s)) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(s);
			int num = Math.abs(Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken()));
			String name = st.nextToken();
			
			map.put(name, map.getOrDefault(name, 0) - num);
		}
		
		while(true) {
			String s = br.readLine();
			
			if("======".equals(s)) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(s);
			int num = Math.abs(Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken()));
			String name = st.nextToken();
			
			map.put(name, map.getOrDefault(name, 0) + num);
		}
		
		StringBuilder sb = new StringBuilder();
		for(String key : map.keySet()) {
			if(map.get(key) == 0) {
				continue;
			}
			
			sb.append(key).append(" ").append(map.get(key) < 0 ? map.get(key) : "+" + map.get(key)).append("\n");
		}
		System.out.print(sb.length() == 0 ? "No differences found." : sb);
	}
}
