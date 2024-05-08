import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		for(int i = 1; i <= m; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 2; j++) {
				pq.add(new Node(i, Integer.parseInt(st.nextToken())));
			}
		}
		
		if(n % (2 * m) == 0) {
			n = 2 * m;
		}
		if(n > 2 * m) {
			n %= (2 * m); 
		}
		
		while(n --> 1) {
			pq.poll();
		}
		System.out.print(pq.peek().idx);
	}
}

class Node implements Comparable<Node>{
	int number, idx;
	
	public Node(int idx, int number) {
		this.idx = idx;
		this.number = number;
	}

	@Override
	public int compareTo(Node o) {
		return this.number - o.number;
	}
}
