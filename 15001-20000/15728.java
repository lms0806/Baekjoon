import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int[] share = new int[n], team = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			share[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			team[i] = Integer.parseInt(st.nextToken());
		}
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				pq.add(new Node(i, j, share[i] * team[j]));
			}
		}
		
		boolean[] flag = new boolean[n];
		while(k --> 0) {
			flag[pq.peek().b] = true;
			pq.poll();
			
			while(flag[pq.peek().b]) {
				pq.poll();
			}
		}
		System.out.print(pq.peek().sum);
	}
}

class Node implements Comparable<Node>{
	int a, b, sum;
	
	public Node(int a, int b, int sum) {
		this.a = a;
		this.b = b;
		this.sum = sum;
	}
	
	@Override
	public int compareTo(Node o) {
		return o.sum - this.sum;
	}
}
