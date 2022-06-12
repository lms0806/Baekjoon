import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			sb.append(bfs(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()))).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String bfs(int start, int end) {
		Queue<Node> queue = new LinkedList<>();
		boolean[] visited = new boolean[10000];
		queue.add(new Node(start, ""));
		visited[start] = true;
		
		while(!queue.isEmpty()) {
			Node now = queue.poll();
			
			if(now.num == end) {
				return now.result;
			}
			
			int nx = (now.num * 2) % 10000;
			if(!visited[nx]) {
				queue.add(new Node(nx, now.result + "D"));
				visited[nx] = true;
			}
			
			nx = now.num - 1;
			if(nx < 0) {
				nx = 9999;
			}
			if(!visited[nx]) {
				queue.add(new Node(nx, now.result + "S"));
				visited[nx] = true;
			}
			
			nx = (now.num % 1000 * 10) + (now.num / 1000);
			if(!visited[nx]) {
				queue.add(new Node(nx, now.result + "L"));
				visited[nx] = true;
			}
			
			nx = (now.num / 10) + (now.num % 10 * 1000); 
			if(!visited[nx]) {
				queue.add(new Node(nx, now.result + "R"));
				visited[nx] = true;
			}
			
		}
		
		return "";
	}
}

class Node{
	int num;
	String result;
	
	public Node(int num, String result) {
		this.num = num;
		this.result = result;
	}
}
