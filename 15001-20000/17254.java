import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		st.nextToken();
		int m = Integer.parseInt(st.nextToken());
		
		Node[] node = new Node[m];
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			node[i] = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), st.nextToken().charAt(0));
		}
		
		Arrays.sort(node);
		
		StringBuilder sb = new StringBuilder();
		for(Node n : node) {
			sb.append(n.c);
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	int a, b;
	char c;
	
	public Node(int a, int b, char c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public int compareTo(Node o) {
		return this.b == o.b ? this.a - o.a : this.b - o.b;
	}
}
