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
		int k = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				pq.add(new Node(Integer.parseInt(st.nextToken()), Double.parseDouble(st.nextToken())));
			}
		}
		
		double answer = 0;
		boolean[] check = new boolean[n + 1];
		while(true) {
			if(k == 0) {
				break;
			}
			
			Node now = pq.poll();
			
			if(check[now.num]) {
				continue;
			}
			
			check[now.num] = true;
			answer += now.s;
			k--;
		}
		System.out.print(String.format("%.1f", answer));
	}
}

class Node implements Comparable<Node>{
	int num;
	double s;
	
	public Node(int num, double s) {
		this.num = num;
		this.s = s;
	}
	
	@Override
	public int compareTo(Node o) {
		return o.s > this.s ? 1 : -1;
	}
}
