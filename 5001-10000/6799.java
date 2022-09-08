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
			String s = st.nextToken();
			int sum = Integer.parseInt(st.nextToken()) * 2 + Integer.parseInt(st.nextToken()) * 3 + Integer.parseInt(st.nextToken());
			
			arr[i] = new Node(s, sum);
		}
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < Math.min(n, 2); i++) {
			sb.append(arr[i].name).append("\n");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	String name;
	int sum;
	
	public Node(String name, int sum) {
		this.name = name;
		this.sum = sum;
	}
	
	@Override
	public int compareTo(Node o) {
		if(o.sum == this.sum) {
			return this.name.compareTo(o.name);
		}
		return o.sum - this.sum;
	}
}
