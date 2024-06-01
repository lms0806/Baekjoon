import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			HashMap<String, Integer> map = new HashMap<>();
			while(n --> 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String name = st.nextToken();
				int num = Integer.parseInt(st.nextToken());
				
				map.put(name, map.getOrDefault(name, 0) + num);
			}
			
			ArrayList<Node> arr = new ArrayList<>();
			for(String key : map.keySet()) {
				arr.add(new Node(key, map.get(key)));
			}
			
			Collections.sort(arr);
			
			sb.append(arr.size()).append("\n");
			for(Node a : arr) {
				sb.append(a.name).append(" ").append(a.num).append("\n");
			}
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node> {
	int num;
	String name;
	
	public Node(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	@Override
	public int compareTo(Node o) {
		if(this.num == o.num) {
			return this.name.compareTo(o.name);
		}
		return o.num - this.num;
	}
}
