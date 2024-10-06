import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		while(n --> 0) {
			pq.add(Integer.parseInt(br.readLine()));
		}
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(0);
		while(!pq.isEmpty()) {
			int num = pq.poll();
			
			arr.add(num + arr.get(arr.size() - 1) / 2);
			
			num -= m;
			
			if(num > k) {
				pq.add(num);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(arr.size() - 1).append("\n");
		for(int i = 1; i < arr.size(); i++) {
			sb.append(arr.get(i)).append("\n");
		}
		System.out.print(sb);
	}
}
