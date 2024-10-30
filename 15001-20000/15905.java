import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Node[] arr = new Node[n];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i] = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		Arrays.sort(arr);
		
		int answer = 0;
		for(int i = 5; i < n; i++) {
			if(arr[4].count == arr[i].count) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}

class Node implements Comparable<Node> {
	int count, score;
	
	public Node(int count, int score) {
		this.count = count;
		this.score = score;
	}
	
	@Override
	public int compareTo(Node o) {
		if(this.count == o.count) {
			return this.score - o.score;
		}
		return o.count - this.count;
	}
}
