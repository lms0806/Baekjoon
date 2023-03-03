import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> queue = new LinkedList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			queue.add(Integer.parseInt(st.nextToken()));
		}
		
		while(queue.size() != 1) {
			int now = queue.poll();
			
			int size = queue.size();
			
			while(size --> 0) {
				queue.add(Math.abs(queue.peek() - now));
				now = queue.poll();
			}
		}
		
		System.out.print(queue.poll());
	}
}
