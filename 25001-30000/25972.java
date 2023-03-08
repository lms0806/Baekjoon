import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Node[] arr = new Node[n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken());
			
			arr[i] = new Node(a, l);
		}
		
		Arrays.sort(arr);
		
		int answer = 0, which = -1;
		for(int i = 0; i < n; i++) {
			if(arr[i].a > which) {
				answer++;
			}
			which = arr[i].a + arr[i].l;
		}
		System.out.print(answer);
	}
}

class Node implements Comparable<Node>{
	int a, l;
	
	public Node(int a, int l) {
		this.a = a;
		this.l = l;
	}
	
	@Override
	public int compareTo(Node o) {
		if(this.a == o.a) {
			return o.l - this.l;
		}
		return this.a - o.a;
	}
}
