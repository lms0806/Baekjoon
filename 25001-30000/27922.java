import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int[] sum12 = new int[n], sum23 = new int[n], sum13 = new int[n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken()), z = Integer.parseInt(st.nextToken());
			
			sum12[i] = x + y;
			sum23[i] = y + z;
			sum13[i] = x + z;
		}
		
		Arrays.sort(sum12);
		Arrays.sort(sum23);
		Arrays.sort(sum13);
		
		int a12 = 0, a23 = 0, a13 = 0;
		for(int i = n - k; i < n; i++) {
			a12 += sum12[i];
			a23 += sum23[i];
			a13 += sum13[i];
		}
		
		System.out.print(Math.max(a12, Math.max(a23, a13)));
	}
}

class Node implements Comparable<Node> {
	int idx, cost;
	
	public Node(int idx, int cost) {
		this.idx = idx;
		this.cost = cost;
	}
	
	@Override
	public int compareTo(Node o) {
		return o.cost - this.cost;
	}
}
