import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			
			if(st.nextToken().equals("jaehak") && st.nextToken().equals("notyet")) {
				int shakeRank = Integer.parseInt(st.nextToken());
				
				if(shakeRank == -1 || shakeRank > 3) {
					pq.add(new Node(name, Integer.parseInt(st.nextToken())));
				}
			}
		}
		
		int size = Math.min(10, pq.size());
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0; i < size; i++) {
			arr.add(pq.poll().name);
		}
		
		Collections.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		sb.append(size).append("\n");
		for(int i = 0; i < size; i++) {
			sb.append(arr.get(i)).append("\n");
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node> {
	int score;
	String name;
	
	public Node(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	@Override
	public int compareTo(Node o) {
		return this.score - o.score;
	}
}
