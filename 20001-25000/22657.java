import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb =  new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			if(n + m == 0) {
				break;
			}
			
			PriorityQueue<Node> pq = new PriorityQueue<>();
			while(n --> 0) {
				st = new StringTokenizer(br.readLine());
				
				pq.add(new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
			}
			
			while(m != 0 && !pq.isEmpty()) {
				Node now = pq.poll();
				
				if(now.count <= m) {
					m -= now.count;
				}
				else {
					pq.add(new Node(now.num, now.count - m));
					m = 0;
				}
			}
			
			int answer = 0;
			while(!pq.isEmpty()) {
				Node now = pq.poll();
				answer += now.num * now.count;
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node> {
	int num, count;
	
	public Node(int count, int num) {
		this.count = count;
		this.num = num;
	}

	@Override
	public int compareTo(Node o) {
		return o.num - this.num;
	}
}
