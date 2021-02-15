import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		
		StringBuilder sb = new StringBuilder();
		while(size-->0) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				if(queue.isEmpty()) {
					sb.append("0");
				}
				else {
					sb.append(queue.poll());
				}
				sb.append("\n");
			}
			else {
				queue.add(num);
			}
		}
		System.out.print(sb);
	}
}
