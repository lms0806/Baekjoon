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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = new Node(Integer.parseInt(st.nextToken()), i);
		}
		
		Arrays.sort(arr);
		
		int[] answer = new int[n];
		for(int i = 0; i < n; i++) {
			answer[arr[i].idx] = i;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int a : answer) {
			sb.append(a).append(" ");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	int idx, num;
	
	public Node(int num, int idx) {
		this.num = num;
		this.idx = idx;
	}

	@Override
	public int compareTo(Node o) {
		return this.num - o.num;
	}
}
