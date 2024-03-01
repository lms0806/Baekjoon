import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String, Integer> map = new HashMap<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			
			if(s.length() > 1 && s.lastIndexOf("#") == 0) {
				map.put(s, map.getOrDefault(s, 0) + 1);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(map.size()).append("\n");
		for(String key : map.keySet()) {
			sb.append(key).append(" ").append(map.get(key)).append("\n");
		}
		System.out.print(sb);
	}
}
