import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken());
		
		Node[] arr = new Node[n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			arr[i] = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())); 
		}
		
		Arrays.sort(arr);
		
		System.out.print(solve(arr, n, m, s));
	}
	
	public static int solve(Node[] arr, int n, int m, int s) {
		if(arr[0].x >= m) {
			return 0;
		}
		
		for(int i = 0; i < n - 1; i++) {
			if(arr[i + 1].x - arr[i].x - arr[i].y >= m) {
				return arr[i].x + arr[i].y;
			}
		}
		
		if(arr[n - 1].x + arr[n - 1].y + m <= s) {
			return arr[n - 1].x + arr[n - 1].y;
		}
		return -1;
	}
}

class Node implements Comparable<Node> {
	int x, y;
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Node o) {
		if(this.x == o.x) {
			return this.y - o.y;
		}
		return this.x - o.x;
	}
}
