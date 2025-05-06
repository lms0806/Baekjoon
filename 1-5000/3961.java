import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[][] board = {{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'}, {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'}, {'z', 'x', 'c', 'v', 'b', 'n', 'm'}};
		
		HashMap<Character, Point> map = new HashMap<>();
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				map.put(board[i][j], new Point(i, j));
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			int n = Integer.parseInt(st.nextToken());
			
			PriorityQueue<Node> pq = new PriorityQueue<>();
			while(n --> 0) {
				String str = br.readLine();
				
				int count = 0;
				for(int i = 0; i < str.length(); i++) {
					if(s.charAt(i) == str.charAt(i)) {
						continue;
					}
					
					count += Math.abs(map.get(s.charAt(i)).x - map.get(str.charAt(i)).x) + Math.abs(map.get(s.charAt(i)).y - map.get(str.charAt(i)).y);
				}
				
				pq.add(new Node(str, count));
			}
			
			while(!pq.isEmpty()) {
				sb.append(pq.peek().s).append(" ").append(pq.poll().count).append("\n");
			}
		}
		System.out.print(sb);
	}
}

class Node implements Comparable<Node> {
	String s;
	int count;
	
	public Node(String s, int count) {
		this.s = s;
		this.count = count;
	}
	
	@Override
	public int compareTo(Node o) {
		if(this.count == o.count) {
			return this.s.compareTo(o.s);
		}
		return this.count - o.count;
	}
}
