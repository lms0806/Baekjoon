import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		HashMap<Character, Integer> map = new HashMap<>();
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				for(char c : st.nextToken().toCharArray()) {
					map.put(c, map.getOrDefault(c, 0) + 1);
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(char key : map.keySet()) {
			sb.append(key).append(" ").append(map.get(key)).append("\n");
		}
		System.out.print(sb);
	}
}
