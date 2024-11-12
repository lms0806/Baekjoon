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
		String s = br.readLine();
		for(int i = 0; i < n; i++) {
			pq.add(new Node(s.charAt(i), i));
		}
		
		while(m --> 0) {
			pq.poll();
		}
		
		char[] ch = new char[n];
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			ch[now.idx] = now.c;
		}
		
		StringBuilder sb = new StringBuilder();
		for(char c : ch) {
			if('a' <= c && c <= 'z') {
				sb.append(c);
			}
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	char c;
	int idx;
	
	public Node(char c, int idx) {
		this.c = c;
		this.idx = idx;
	}
	
	@Override
	public int compareTo(Node o) {
		if(this.c == o.c) {
			return this.idx - o.idx;
		}
		return this.c - o.c;
	}
}
