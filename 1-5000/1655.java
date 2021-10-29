import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> min = new PriorityQueue<>(), max = new PriorityQueue<>(Collections.reverseOrder());
		
		StringBuilder sb = new StringBuilder();
		while(n --> 0) {
			int num = Integer.parseInt(br.readLine());
			
			if(min.size() == max.size()) {
				max.add(num);
			}
			else {
				min.add(num);
			}
			
			if(!min.isEmpty() && !max.isEmpty()) {
				if(min.peek() < max.peek()) {
					int temp = min.poll();
					min.add(max.poll());
					max.add(temp);
				}
			}
			sb.append(max.peek()).append("\n");
		}
		System.out.print(sb);
	}
}
