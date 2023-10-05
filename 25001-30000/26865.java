import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		int answer = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			answer += arr[i];
		}
		
		Arrays.sort(arr);
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i = 0; i < k; i++) {
			pq.add(arr[i]);
		}
		
		for(int i = k; i < n; i++) {
			int num = pq.poll();
			
			answer += num;
			
			pq.add(num + arr[i]);
		}
		
		System.out.print(answer);
	}
}
