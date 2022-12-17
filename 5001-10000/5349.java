import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		TreeMap<String, Integer> map = new TreeMap<>();
		
		String s;
		while((s = br.readLine()) != null) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		
		StringBuilder sb = new StringBuilder();
		for(String key : map.keySet()) {
			if(map.get(key) > 1) {
				sb.append(key).append("\n");
			}
		}
		System.out.print(sb);
	}
}
