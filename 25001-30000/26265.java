import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			pq.add(new Node(st.nextToken(), st.nextToken()));
		}
		
		StringBuilder sb = new StringBuilder();
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			sb.append(now.mentor).append(" ").append(now.mentee).append("\n");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	String mentor, mentee;
	
	public Node(String mentor, String mentee) {
		this.mentor = mentor;
		this.mentee = mentee;
	}

	@Override
	public int compareTo(Node o) {
		if(o.mentor.compareTo(this.mentor) == 0) {
			return o.mentee.compareTo(this.mentee);
		}
		return this.mentor.compareTo(o.mentor);
	}
}
