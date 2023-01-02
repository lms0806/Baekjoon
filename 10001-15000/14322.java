import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			int n = Integer.parseInt(br.readLine());
			
			PriorityQueue<Node> pq = new PriorityQueue<>();
			while(n --> 0) {
				int count = 0;
				String s = br.readLine();
				boolean[] alpha = new boolean[26];
				for(char c : s.toCharArray()) {
					if(c >= 'A' && c <= 'Z') {
						if(!alpha[c - 'A']) {
							alpha[c - 'A'] = true;
							count++;
						}
					}
				}
				
				pq.add(new Node(s, count));
			}
			
			sb.append("Case #").append(i).append(": ").append(pq.poll().name).append("\n");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	String name;
	int alpha;
	
	public Node(String name, int alpha) {
		this.name = name;
		this.alpha = alpha;
	}
	
	@Override
	public int compareTo(Node o) {
		if(this.alpha == o.alpha) {
			return this.name.compareTo(o.name);
		}
		return o.alpha - this.alpha;
	}
}
