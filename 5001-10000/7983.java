import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Node[] arr = new Node[n];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			arr[i] = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		Arrays.sort(arr);
		
		int now = arr[0].t - arr[0].d;
		for(int i = 1; i < n; i++) {
			now = now >= arr[i].t ? arr[i].t - arr[i].d : now - arr[i].d;
		}
		System.out.print(now);
	}
}

class Node implements Comparable<Node> {
	int d, t;
	
	public Node(int d, int t) {
		this.d = d;
		this.t = t;
	}
	
	@Override
	public int compareTo(Node o) {
		return o.t - this.t;
	}
}
