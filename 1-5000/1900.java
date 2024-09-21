import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Node[] node = new Node[n];
		for(int i = 0; i < n; i++) {
			int count = 0;
			for(int j = 0; j < n; j++) {
				if(i == j) {
					continue;
				}
				
				if(arr[i][0] + arr[j][0] * arr[i][1] > arr[j][0] + arr[i][0] * arr[j][1]) {
					count++;
				}
			}
			node[i] = new Node(i + 1, count);
		}
		
		Arrays.sort(node);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(node[i].idx).append("\n");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	int idx, num;
	
	public Node(int idx, int num) {
		this.idx = idx;
		this.num = num;
	}

	@Override
	public int compareTo(Node o) {
		return o.num - this.num;
	}
}
