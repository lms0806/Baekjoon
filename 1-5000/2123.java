import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][2];
		
		int weightSum = 0;
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			weightSum += arr[i][0];
		}
		
		Node[] dangers = new Node[n];
		
		for(int i = 0; i < n; i++) {
			dangers[i] = new Node(i, weightSum - arr[i][0] - arr[i][1]);
		}
		
		Arrays.sort(dangers);
		
		int answer = dangers[0].danger;
		int num = arr[dangers[0].idx][0];
		for(int i = 1; i < n; i++) {
			answer = Math.max(answer, dangers[i].danger - num);
			num += arr[dangers[i].idx][0];
		}
		System.out.print(answer);
	}
}

class Node implements Comparable<Node> {
	int idx, danger;
	
	public Node(int idx, int danger) {
		this.idx = idx;
		this.danger = danger;
	}
	
	@Override
	public int compareTo(Node o) {
		return this.danger - o.danger;
	}
}
