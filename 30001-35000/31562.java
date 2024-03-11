import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int index = 0;
		HashMap<String, Integer> map = new HashMap<>();
		HashMap<Integer, String> idx = new HashMap<>();
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			
			String name = st.nextToken(), code = st.nextToken() + " " + st.nextToken() + " " + st.nextToken();
			
			map.put(code, map.containsKey(code) ? -1 : index);
			idx.put(index++, name);
		}
		
		StringBuilder sb = new StringBuilder();
		while(m --> 0) {
			String s = br.readLine();
			
			sb.append(map.containsKey(s) ? map.get(s) == -1 ? "?" : idx.get(map.get(s)) : "!").append("\n");
		}
		System.out.print(sb);
	}
}
