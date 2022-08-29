import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

public class Main {
	static int k;
	static HashSet<String> set;
	static boolean[] visited;
	static TreeMap<String, Integer> map = new TreeMap<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = new String[3];
		for(int i = 0; i < 3; i++) {
			s[i] = br.readLine();
		}
		
		k = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < 3; i++) {
			visited = new boolean[s[i].length()];
			set = new HashSet<>();
			
			dfs(new StringBuilder(), 0, s[i], 0);
			
			Iterator<String> iter = set.iterator();
			while(iter.hasNext()) {
				String str = iter.next();
				
				map.put(str,  map.containsKey(str) ? map.get(str) + 1 : 1);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(String key : map.keySet()) {
			if(map.get(key) > 1) {
				sb.append(key).append("\n");
			}
		}
		System.out.print(sb.toString().equals("") ? -1 : sb);
	}
	
	public static void dfs(StringBuilder sb, int depth, String s, int which) {
		if(depth == k) {
			set.add(sb.toString());
			return;
		}
		
		for(int i = which; i < s.length(); i++) {
			if(!visited[i]) {
				visited[i] = true;
				sb.append(s.charAt(i) + "");
				dfs(sb, depth + 1, s, i + 1);
				sb.setLength(sb.length() - 1);
				visited[i] = false;
			}
		}
	}
}
