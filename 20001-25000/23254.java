import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()) * 24, m = Integer.parseInt(st.nextToken());
		
		int[] a = new int[m];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			pq.add(new Node(a[i], Integer.parseInt(st.nextToken())));
		}
		
		int answer = 0;
		while(n --> 0) {
			while(!pq.isEmpty() && pq.peek().score == 100) {
				answer += pq.poll().score;
			}
			
			if(pq.isEmpty()) {
				break;
			}
			
			Node now = pq.poll();
			
			pq.add(new Node(Math.min(now.score + now.high, 100), now.high));
		}
		
		while(!pq.isEmpty()) {
			answer += pq.poll().score;
		}
		System.out.print(answer);
	}
}

class Node implements Comparable<Node> {
	int score, high;
	
	public Node(int score, int high) {
		this.score = score;
		this.high = high;
	}
	
	@Override
	public int compareTo(Node o) {
		return Math.min(100 - o.score, o.high) - Math.min(100 - this.score, this.high);
	}
}
