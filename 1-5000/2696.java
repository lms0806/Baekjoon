import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			PriorityQueue<Integer> min = new PriorityQueue<>(), max = new PriorityQueue<>(Collections.reverseOrder());
			
			sb.append((n + 1) / 2).append("\n");
			StringTokenizer st = null;
			int count = 0;
			for(int i = 0; i < n; i++) {
				if(i % 10 == 0) {
					st = new StringTokenizer(br.readLine());
				}
				
				int num = Integer.parseInt(st.nextToken());
				
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
				
				if(i % 2 == 0) {
					sb.append(max.peek()).append(" ");
					count++;
					if(count % 10 == 0) {
						sb.append("\n");
					}
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
