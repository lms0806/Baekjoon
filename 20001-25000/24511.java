import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		boolean[] flag = new boolean[n];	
		Deque<Integer> deque = new ArrayDeque<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			if(Integer.parseInt(st.nextToken()) == 1) {
				flag[i] = true;
			}
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(!flag[i]) {
				deque.addLast(num);
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			deque.addFirst(Integer.parseInt(st.nextToken()));
			
			sb.append(deque.pollLast()).append(" ");
		}
		System.out.print(sb);
	}
}
