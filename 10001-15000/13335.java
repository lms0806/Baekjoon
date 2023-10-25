import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), w = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken());
		
		Queue<Integer> truck = new LinkedList<>();

		st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			truck.add(Integer.parseInt(st.nextToken()));
		}
		
		int answer = 0;
		Deque<Node> bridge = new ArrayDeque<>();
		while(!truck.isEmpty() || !bridge.isEmpty()) {
			int weight = 0;
			int len = bridge.size();
			for(int i = 0; i < len; i++) {
				Node now = bridge.pollFirst();
				
				if(now.time == 1) {
					continue;
				}
				
				bridge.add(new Node(now.w, now.time - 1));
				weight += now.w;
			}
			
			if(!truck.isEmpty() && truck.peek() + weight <= l && bridge.size() < w) {
				bridge.add(new Node(truck.poll(), w));
			}
			
			answer++;
		}
		System.out.print(answer);
	}
}

class Node{
	int w, time;
	
	public Node(int w, int time) {
		this.w = w;
		this.time = time;
	}
}
