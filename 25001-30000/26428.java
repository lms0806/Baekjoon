import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= size; t++) {
			int n = Integer.parseInt(br.readLine());
			
			Node[] arr = new Node[n];
			Node2[] arr2 = new Node2[n];
			for(int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String c = st.nextToken();
				int d = Integer.parseInt(st.nextToken()), u = Integer.parseInt(st.nextToken());
				
				arr[i] = new Node(c, u);
				arr2[i] = new Node2(d, u);
			}
			
			Arrays.sort(arr);
			Arrays.sort(arr2);
			
			int answer = 0;
			for(int i = 0; i < n; i++) {
				if(arr[i].u == arr2[i].u) {
					answer++;
				}
			}
			
			sb.append("Case #").append(t).append(": ").append(answer).append("\n");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	String c;
	int u;
	
	public Node(String c, int u) {
		this.c = c;
		this.u = u;
	}

	@Override
	public int compareTo(Node o) {
		if(this.c.compareTo(o.c) == 0) {
			return this.u - o.u;
		}
		return this.c.compareTo(o.c);
	}
}

class Node2 implements Comparable<Node2>{
	int d, u;
	
	public Node2(int d, int u) {
		this.d = d;
		this.u = u;
	}

	@Override
	public int compareTo(Node2 o) {
		if(this.d == o.d) {
			return this.u - o.u;
		}
		return this.d - o.d;
	}
}
