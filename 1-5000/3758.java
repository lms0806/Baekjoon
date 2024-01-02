import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
			int ids = Integer.parseInt(st.nextToken()) - 1, m = Integer.parseInt(st.nextToken());
			
			int[][] scores = new int[n][k];
			int[] counts = new int[n];
			int[] times = new int[n];
			
			for(int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine());
				
				int id = Integer.parseInt(st.nextToken()) - 1, j = Integer.parseInt(st.nextToken()) - 1;
				int s = Integer.parseInt(st.nextToken());
				
				scores[id][j] = Math.max(scores[id][j], s);
				counts[id]++;
				times[id] = i;
			}
			
			Node[] node = new Node[n];
			for(int i = 0; i < n; i++) {
				int sum = 0;
				for(int j = 0; j < k; j++) {
					sum += scores[i][j];
				}
				
				node[i] = new Node(i, sum, counts[i], times[i]);
			}
			
			Arrays.sort(node);
			
			sb.append(solve(node, ids)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int solve(Node[] node, int id) {
		for(int i = 0; i < node.length; i++) {
			if(node[i].id == id) {
				return i + 1;
			}
		}
		return 0;
	}
}

class Node implements Comparable<Node>{
	int id, score, count, time;
	
	public Node(int id, int score, int count, int time) {
		this.id = id;
		this.score = score;
		this.count = count;
		this.time = time;
	}

	@Override
	public int compareTo(Node o) {
		if(this.score == o.score) {
			if(this.count == o.count) {
				return this.time - o.time;
			}
			return this.count - o.count;
		}
		return o.score - this.score;
	}
}
