import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int answer = 0, sum = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(sum + num <= m) {
				sum += num;
				pq.add(num);
				answer++;
			}
			else if(k > 0) {
				if(pq.isEmpty()) {
					k--;
					answer++;
				}
				else {
					if(pq.peek() > num) {
						k--;
						sum -= pq.peek();
						pq.poll();
					}
					
					if(sum + num <= m) {
						sum += num;
						pq.add(num);
						answer++;
					}
					else if(k > 0){
						k--;
						answer++;
					}
					else {
						break;
					}
				}
			}
			else {
				break;
			}
		}
		System.out.print(answer);
	}
}
