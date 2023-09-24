import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		TreeMap<String, HashSet<String>> map = new TreeMap<>();
		
		while(t --> 0) {
			String[] s = br.readLine().split(" ");
			
			StringBuilder str = new StringBuilder();
			for(int i = 0; i < s.length - 1; i++) {
				str.append(s[i]).append(" ");
			}
			
			if(!map.containsKey(s[s.length - 1])) {
				map.put(s[s.length - 1], new HashSet<>());
			}
			
			if(!map.get(s[s.length - 1]).contains(str.toString())) {
				map.get(s[s.length - 1]).add(str.toString());
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(String s : map.keySet()) {
			sb.append(s).append(" ").append(map.get(s).size()).append("\n");
		}
		System.out.print(sb);
	}
}

class Node{
	String name, select;
	
	public Node(String name, String select) {
		this.name = name;
		this.select = select;
	}
}
