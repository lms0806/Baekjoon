import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		HashMap<Character, Character> map = new HashMap<>();
		
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			map.put(st.nextToken().charAt(0), st.nextToken().charAt(0));
		}
		
		n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(n --> 0) {
			char c = br.readLine().charAt(0);
			
			sb.append(map.containsKey(c) ? map.get(c) : c);
		}
		System.out.print(sb);
	}
}
