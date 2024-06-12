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
		
		int n = Integer.parseInt(br.readLine());
		
		HashMap<String, Integer> map = new HashMap<>();
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken(), name = st.nextToken();
			
			int time = Integer.parseInt(s.split(":")[0]) * 60 + Integer.parseInt(s.split(":")[1]);
			
			map.put(name, map.getOrDefault(name, 0) + time);
		}
		
		ArrayList<Node> arr = new ArrayList<>();
		for(String key : map.keySet()) {
			int time = map.get(key) - 100;
			int cost = 10;
			
			if(time > 0) {
				cost += (time / 50) * 3;
				if(time % 50 > 0) {
					cost += 3;
				}
			}
			arr.add(new Node(key, cost));
		}
		
		Collections.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(Node node : arr) {
			sb.append(node.name).append(" ").append(node.cost).append("\n");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node> {
	String name;
	int cost;
	
	public Node(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}

	@Override
	public int compareTo(Node o) {
		if(this.cost == o.cost) {
			return this.name.compareTo(o.name);
		}
		return o.cost - this.cost;
	}
}
