import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		TreeMap<String, String> map = new TreeMap<>();
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			map.put(st.nextToken(), st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		while(m --> 0) {
			sb.append(solve(map, br.readLine())).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(TreeMap<String, String> map, String s) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			for(String key : map.keySet()) {
				if(c != key.charAt(0) || i + key.length() > s.length() || !s.substring(i, i + key.length()).equals(key)) {
					continue;
				}
				
				sb.append(map.get(key));
			}
		}
		return sb.length() == 0 ? "-1" : sb.toString();
	}
}
