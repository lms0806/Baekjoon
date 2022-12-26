import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			
			pq.add(new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		
		int answer = 0;
		while(n > 0) {
			Node now = pq.poll();
			
			if(now.count > n) {
				answer += n * now.cost;
				break;
			}
			else {
				n -= now.count;
				answer += now.cost * now.count;
			}
		}
		System.out.print(answer);
	}
}

class Node implements Comparable<Node>{
	int cost, count;
	
	public Node(int cost, int count) {
		this.cost = cost;
		this.count = count;
	}
	
	@Override
	public int compareTo(Node o) {
		return this.cost - o.cost;
	}
}
