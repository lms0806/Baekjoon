import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		int n = Integer.parseInt(br.readLine());
		
		int answer = 0, sum = 0;
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			
			sum += num;
			queue.add(num);
			
			if(queue.size() > 4) {
				sum -= queue.poll();
			}
			
			if(sum > size) {
				break;
			}
			answer++;
		}
		System.out.print(answer);
	}
}
