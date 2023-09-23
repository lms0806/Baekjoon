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
			
			arr[i] = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(Node node : arr) {
			sb.append(node.l).append(" ").append(node.m).append("\n");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	int l, m;
	
	public Node(int l, int m) {
		this.l = l;
		this.m = m;
	}

	@Override
	public int compareTo(Node o) {
		if(this.l == o.l) {
			return this.m - o.m;
		}
		return this.l - o.l;
	}
}
