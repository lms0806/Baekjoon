import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		Node[] arr = new Node[m];
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			arr[i] = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		Arrays.sort(arr);
		
		int answer = 0;
		for(int i = 0; i < m - 1; i++) {
			answer += Math.max(0, n - arr[i].a);
		}
		System.out.print(answer);
	}
}

class Node implements Comparable<Node>{
	int a, b;
	
	public Node(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int compareTo(Node o) {
		if(this.a == o.a) {
			return this.b - this.a;
		}
		return o.a - this.a;
	}
}
