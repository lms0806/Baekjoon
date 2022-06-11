import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long s = Long.parseLong(st.nextToken()), t = Long.parseLong(st.nextToken());
		
		if(s == t) {
			System.out.print(0);
		}
		
		System.out.print(bfs(s, t));
	}
	
	public static String bfs(long s, long e) {
		Queue<Node> queue = new LinkedList<>();
		HashSet<Long> set = new HashSet<>();
		queue.add(new Node(s, ""));
		set.add(s);
		
		char[] dx = {'*', '+', '-', '/'};
		while(!queue.isEmpty()) {
			Node now = queue.poll();
			
			if(now.num == e) {
				return now.result;
			}
			
			for(int i = 0; i < 4; i++) {
				long nx = now.num;
				if(i == 0) {
					nx *= nx;
				}
				else if(i == 1) {
					nx += nx;
				}
				else {
					nx = i == 2 ? 0 : 1;
				}
				
				if(nx >= 0 && !set.contains(nx)) {
					queue.add(new Node(nx, now.result + dx[i]));
					set.add(nx);
				}
			}
		}
		
		return "-1";
	}
}

class Node {
	public long num;
	public String result;

	public Node(long num, String result) {
		this.num = num;
		this.result = result;
	}
}
