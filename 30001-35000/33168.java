import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		Queue<Integer> queue = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			queue.add(Integer.parseInt(st.nextToken()));
		}
		
		StringBuilder sb = new StringBuilder();
		while(queue.size() > 1) {
			int size = queue.size() - 1;
			
			int now = queue.poll();
			while(size --> 0) {
				sb.append(now + queue.peek()).append(" ");
				queue.add(now + queue.peek());
				now = queue.poll();
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
