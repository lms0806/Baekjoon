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
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			arr[i] = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		Arrays.sort(arr);
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			Node now = arr[i];
			
			if(answer < now.arrive) {
				answer = now.arrive;
			}
			
			answer += now.time;
		}
		
		System.out.print(answer);
	}
}

class Node implements Comparable<Node>{
	int arrive, time;
	
	public Node(int arrive, int time) {
		this.arrive = arrive;
		this.time = time;
	}

	@Override
	public int compareTo(Node o) {
		if(this.arrive == o.arrive) {
			return this.time - o.time;
		}
		return this.arrive - o.arrive;
	}
}
