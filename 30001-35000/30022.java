import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			
			pq.add(new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		
		long answer = 0;
		while(a --> 0) {
			answer += pq.poll().a;
		}
		while(b --> 0) {
			answer += pq.poll().b;
		}
		System.out.print(answer);
	}
}

class Node implements Comparable<Node> {
	int a, b;
	
	public Node(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public int compareTo(Node o) {
		return (this.a - this.b) - (o.a - o.b);
	}
}
