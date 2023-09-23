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
			
			int w = Integer.parseInt(st.nextToken()), h = Integer.parseInt(st.nextToken());
			
			arr[i] = new Node(i + 1, Math.sqrt(w * w + h * h) / 77);
		}
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(Node node : arr) {
			sb.append(node.idx).append("\n");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	int idx;
	double num;
	
	public Node(int idx, double num) {
		this.idx = idx;
		this.num = num;
	}

	@Override
	public int compareTo(Node o) {
		if(this.num < o.num) {
			return 1;
		}
		else if(this.num == o.num) {
			return 0;
		}
		return -1;
	}
}
