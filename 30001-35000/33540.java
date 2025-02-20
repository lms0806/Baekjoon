import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		TreeMap<String, Integer> map = new TreeMap<>();
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			map.put(name, map.getOrDefault(name, 0) + Integer.parseInt(st.nextToken()));
		}
		
		StringBuilder sb = new StringBuilder();
		for(String key : map.keySet()) {
			sb.append(key).append(" ").append(map.get(key)).append("\n");
		}
		System.out.print(sb);
	}
}
