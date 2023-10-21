import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		Node[] arr = new Node[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = new Node(i + 1, Integer.parseInt(br.readLine()));
		}
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < k; i++) {
			sb.append(arr[i].idx).append("\n");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	int num, idx;
	
	public Node(int idx, int num) {
		this.idx = idx;
		this.num = num;
	}
	
	@Override
	public int compareTo(Node o) {
		return o.num - this.num;
	}
}
