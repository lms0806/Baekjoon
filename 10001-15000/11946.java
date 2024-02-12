import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		
		boolean[][] pass = new boolean[n][m];
		int[][] wrongCount = new int[n][m];
		int[] solve = new int[n], count = new int[n];
		
		while(q --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int time = Integer.parseInt(st.nextToken());
			int team = Integer.parseInt(st.nextToken()) - 1, problem = Integer.parseInt(st.nextToken()) - 1;
			String result = st.nextToken();
			
			if(!result.equals("AC")) {
				if(!pass[team][problem]) {
					wrongCount[team][problem]++;
				}
			} 
			else {
				if(!pass[team][problem]) {
					count[team]++;
					pass[team][problem] = true;
					solve[team] += time + (wrongCount[team][problem] * 20);
				}
			}
		}
		
		Node[] node = new Node[n];
		for(int i = 0; i < n; i++) {
			node[i] = new Node(i + 1, count[i], solve[i]);
		}
		
		Arrays.sort(node);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(node[i].team).append(" ").append(node[i].solve).append(" ").append(node[i].time).append("\n");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node>{
	int team, solve, time;
	
	public Node(int team, int solve, int time) {
		this.team = team;
		this.solve = solve;
		this.time = time;
	}
	
	@Override
	public int compareTo(Node o) {
		if(this.solve == o.solve) {
			return this.time - o.time;
		}
		return o.solve - this.solve;
	}
}
