import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 1; i <= n; i++) {
			queue.add(i);
		}
		
		while(true) {
			boolean flag = false;
			queue.add(queue.poll());
			for(int i = 1; i < k; i++) {
				if(queue.size() == 1) {
					flag = true;
					break;
				}
				queue.poll();
			}
			
			if(flag) {
				break;
			}
		}
		System.out.print(queue.peek());
	}
}
