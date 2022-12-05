import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String name = st.nextToken();
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			pq.add(new Node(name, a, b));
		}
		
		StringBuilder sb = new StringBuilder();
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			sb.append(now.name.charAt(now.d -1));
		}
		System.out.print(sb.toString().toUpperCase());
	}
}

class Node implements Comparable<Node>{
	String name;
	int i, d;
	
	public Node(String name, int i, int d) {
		this.name = name;
		this.i = i;
		this.d = d;
	}
	
	@Override
	public int compareTo(Node o) {
		return this.i - o.i;
	}
}
