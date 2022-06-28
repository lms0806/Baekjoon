import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	static int[] d = {60, 10, -10, 1, -1};
	static int n;
	static Node[] times = new Node[65];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		bfs();
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			n = Integer.parseInt(br.readLine());
			
			int m = n / 60;
			int r = n % 60;
			
			sb.append(times[r].addh + m).append(" ").append(times[r].addt).append(" ");
			sb.append(times[r].mint).append(" ").append(times[r].addo).append(" ");
			sb.append(times[r].mino).append("\n");
		}
		System.out.print(sb);
	}
	
	public static void bfs() {
		Queue<Node> queue = new LinkedList<>();
		boolean[] visited = new boolean[65];
		queue.add(new Node(0, 0, 0, 0, 0, 0));
		
		while(!queue.isEmpty()) {
			Node now = queue.poll();
			
			if(now.time >= 0 && now.time <= 60 && !visited[now.time]) {
				visited[now.time] = true;
				times[now.time] = now;
				queue.add(new Node(now.time - 1, now.addh, now.addt, now.mint, now.addo, now.mino + 1));
				queue.add(new Node(now.time + 1, now.addh, now.addt, now.mint, now.addo + 1, now.mino));
				queue.add(new Node(now.time - 10, now.addh, now.addt, now.mint + 1, now.addo, now.mino));
				queue.add(new Node(now.time + 10, now.addh, now.addt + 1, now.mint, now.addo, now.mino));
				queue.add(new Node(now.time + 60, now.addh + 1, now.addt, now.mint, now.addo, now.mino));
			}
		}
	}
}

class Node{
	int time, addh, addt, mint, addo, mino;
	
	public Node(int time, int addh, int addt, int mint, int addo, int mino) {
		this.time = time;
		this.addh = addh;
		this.addt = addt;
		this.mint = mint;
		this.addo = addo;
		this.mino = mino;
	}
}
