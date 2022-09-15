import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			int n = Integer.parseInt(br.readLine().trim());
			
			TreeMap<String, HashSet<String>> map = new TreeMap<>();
			
			while(n --> 0) {
				String[] str = br.readLine().split(" ");
				String s = "";
				String year = str[str.length - 1];
				
				for(int j = 0; j < str.length - 1; j++) {
					s += str[j] + " ";
				}
				
				if(map.containsKey(s)) {
					map.get(s).add(year);
				}
				else {
					HashSet<String> set = new HashSet<>();
					set.add(year);
					
					map.put(s, set);
				}
			}
			
			sb.append("Case #").append(i).append(":").append("\n");
			for(String s : map.keySet()) {
				if(map.get(s).size() < 5) {
					sb.append(s).append("\n");
				}
			}
		}
		System.out.print(sb);
	}
}
