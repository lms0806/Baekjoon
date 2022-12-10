import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		PriorityQueue<Integer> num = new PriorityQueue<>();
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			pq.add(new Node(a, b));
		}
		
		int round = 1;
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(round <= now.deadline) {
				num.add(now.cup);
				round++;
			}
			else {
				if(num.peek() < now.cup) {
					num.poll();
					num.add(now.cup);
				}
			}
		}
		
		long sum = 0;
		while(!num.isEmpty()) {
			sum += num.poll();
		}
		System.out.print(sum);
	}
}
class Node implements Comparable<Node>{
	int deadline, cup;
	
	public Node(int deadline, int cup) {
		this.deadline = deadline;
		this.cup = cup;
	}
	
	@Override
	public int compareTo(Node o) {
		if(this.deadline == o.deadline) {
			return this.cup - o.cup;
		}
		return this.deadline - o.deadline;
	}
}
