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
			String name = st.nextToken();
			int score = Integer.parseInt(st.nextToken()), risk = Integer.parseInt(st.nextToken()), cost = Integer.parseInt(st.nextToken());
			
			arr[i] = new Node(name, score * score * score / (cost * (risk + 1)), cost);
		}
		
		Arrays.sort(arr);
		
		System.out.print(arr[1].name);
	}
}

class Node implements Comparable<Node> {
	String name;
	int score, cost;
	
	public Node(String name, int score, int cost) {
		this.name = name;
		this.score = score;
		this.cost = cost;
	}
	
	@Override
	public int compareTo(Node o) {
		if(this.score == o.score) {
			if(this.cost == o.cost) {
				return this.name.compareTo(o.name);
			}
			return this.cost - o.cost;
		}
		return o.score - this.score;
	}
}
