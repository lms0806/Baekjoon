import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		int max = 0;
		TreeMap<Character, Integer> map = new TreeMap<>();
		while((s = br.readLine()) != null) {
			for(char c : s.toCharArray()) {
				if(c == ' ') {
					continue;
				}
				map.put(c, map.getOrDefault(c, 0) + 1);
				max = Math.max(max, map.get(c));
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = max; i > 0; i--) {
			for(char key : map.keySet()) {
				sb.append(map.get(key) >= i ? '#' : ' ');
			}
			sb.append("\n");
		}
		
		for(char key : map.keySet()) {
			sb.append(key);
		}
		System.out.print(sb);
	}
}
