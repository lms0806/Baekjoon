import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			pq.add(new Node(Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken())));
		}
		
		int[] num = new int[1001];
		for(int i = 0; i < n; i++) {
			Node now = pq.poll();
			
			int score = now.score;
			for(int j = now.time; j >= 0; j--) {
				if(num[j] < score) {
					int temp = score;
					score = num[j];
					num[j] = temp;
				}
			}
		}
		
		int sum = 0;
		for(int i = 0; i < 1001; i++) {
			sum += num[i];
		}
		System.out.print(sum);
	}
}

class Node implements Comparable<Node>{
	int time, score;
	
	public Node(int time, int score){
		this.time = time;
		this.score = score;
	}

	@Override
	public int compareTo(Node o) {
		return 0;
	}
	
}
