import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		StringBuilder sb = new StringBuilder();
		while(size-->0) {
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0) {
				sb.append(queue.isEmpty() ? "0" : queue.poll()).append("\n");
			}
			else {
				queue.add(num);
			}
		}
		System.out.print(sb);
	}
}
