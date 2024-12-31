import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> plus = new ArrayList<>(), minus = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num < 0) {
				minus.add(num);
			}
			else {
				plus.add(num);
			}
		}
		
		Collections.sort(plus, Collections.reverseOrder());
		Collections.sort(minus);
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i = 0; i < plus.size(); i += m) {
			pq.add(Math.abs(plus.get(i)));
		}
		for(int i = 0; i < minus.size(); i += m) {
			pq.add(Math.abs(minus.get(i)));
		}
		
		int answer = 0;
		while(pq.size() > 1) {
			answer += pq.poll() * 2;
		}
		
		System.out.print(answer + pq.peek());
	}
}
