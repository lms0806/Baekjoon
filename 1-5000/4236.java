import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("0")) {
				break;
			}
			
			String project = "";
			HashMap<String, Integer> name = new HashMap<>();
			HashMap<String, HashSet<String>> map = new HashMap<>();
			while(true) {
				if(s.length() == s.replaceAll("[a-z]", "").length()) {
					if(!map.containsKey(s)) {
						map.put(s, new HashSet<>());
					}
					
					project = s;
				}
				else {
					if(!map.get(project).contains(s)) {
						name.put(s, name.getOrDefault(s, 0) + 1);
					}
					map.get(project).add(s);
				}
				
				s = br.readLine();
				
				if(s.equals("1")) {
					break;
				}
			}
			
			for(String str : name.keySet()) {
				if(name.get(str) > 1) {
					for(String m : map.keySet()) {
						if(map.get(m).contains(str)) {
							map.get(m).remove(str);
						}
					}
				}
			}
			
			ArrayList<Node> arr = new ArrayList<>();
			for(String m : map.keySet()) {
				arr.add(new Node(m, map.get(m).size()));
			}
			
			Collections.sort(arr);
			
			for(Node node : arr) {
				sb.append(node.project).append(" ").append(node.count).append("\n");
			}
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	String project;
	int count;
	
	public Node(String project, int count) {
		this.project = project;
		this.count = count;
	}
	
	@Override
	public int compareTo(Node o) {
		if(this.count == o.count) {
			return this.project.compareTo(o.project);
		}
		return o.count - this.count;
	}
}
