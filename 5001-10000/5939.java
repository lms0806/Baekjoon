import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Node[] arr = new Node[n];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			arr[i] = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(Node node : arr) {
			sb.append(node.h).append(" ").append(node.m).append(" ").append(node.s).append("\n");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	int h, m, s;
	
	public Node(int h, int m, int s) {
		this.h = h;
		this.m = m;
		this.s = s;
	}

	@Override
	public int compareTo(Node o) {
		if(this.h == o.h) {
			if(this.m == o.m) {
				return this.s - o.s;
			}
			return this.m - o.m;
		}
		return this.h - o.h;
	}
}
