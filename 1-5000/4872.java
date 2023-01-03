import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		String s;
		while((s = br.readLine()) != null) {
			for(int i = 0; i < s.length(); i++) {
				map.put(i, map.getOrDefault(i, 0) + s.charAt(i) - '0');
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(Integer key : map.keySet()) {
			sb.append(map.get(key) % 10);
		}
		System.out.print(sb);
	}
}
