import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> queue = new LinkedList<>();
		while(true) {
			int num = Integer.parseInt(br.readLine());
			
			if(num == -1) {
				break;
			}
			
			if(num == 0) {
				queue.poll();
			}
			else {
				if(queue.size() == n) {
					continue;
				}
				queue.add(num);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(!queue.isEmpty()) {
			sb.append(queue.poll()).append(" ");
		}
		System.out.print(sb.length() == 0 ? "empty" : sb);
	}
}
