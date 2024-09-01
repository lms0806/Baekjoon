import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
		
		ArrayList<Node> arr = new ArrayList<>();
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			
			if(num <= sum) {
				arr.add(new Node(i, num));
			}
		}
		
		Collections.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		sb.append(0).append(" ");
		for(int i = 0; i < Math.min(m - 1, arr.size()); i++) {
			sb.append(arr.get(i).idx).append(" ");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	int idx, sum;
	
	public Node(int idx, int sum) {
		this.idx = idx;
		this.sum = sum;
	}

	@Override
	public int compareTo(Node o) {
		return o.sum - this.sum;
	}
}
