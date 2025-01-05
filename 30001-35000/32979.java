import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()) << 1;
		
		int t = Integer.parseInt(br.readLine());
		
		Queue<Integer> queue = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			queue.add(Integer.parseInt(st.nextToken()));
		}
		
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		while(t --> 0) {
			int num = Integer.parseInt(st.nextToken());
			
			while(num --> 1) {
				queue.add(queue.poll());
			}
			
			sb.append(queue.peek()).append(" ");
		}
		System.out.print(sb);
	}
}
