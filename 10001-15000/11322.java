import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			sb.append(n == 1 ? 1 : bfs(n)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static long bfs(int n) {
		Queue<Long> queue = new LinkedList<>();
		queue.add((long) 1);
		
		while(!queue.isEmpty()) {
			long now = queue.poll();
			
			long nx = now * 10;
			if(nx % n == 0) {
				return nx;
			}
			queue.add(nx);
			nx++;
			if(nx % n == 0) {
				return nx;
			}
			queue.add(nx);
		}
		return -1;
	}
}
