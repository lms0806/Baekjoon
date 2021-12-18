import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i = 0; i < m; i++) {
			pq.add(0);
		}
		
		for(int i = n - 1; i >= 0; i--) {
			pq.add(pq.poll() + arr[i]);
		}
		
		while(pq.size() != 1) {
			pq.poll();
		}
		
		System.out.print(pq.poll());
	}
}
