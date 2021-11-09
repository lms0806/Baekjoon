import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int[] check;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n];
		check = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.print(bfs());
	}
	
	public static int bfs() {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(0);
		
		Arrays.fill(check, Integer.MAX_VALUE);
		
		check[0] = 0;
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			
			for(int i = 1; i <= arr[now]; i++) {
				if(now + i >= n) {
					break;
				}
				if(check[now + i] > check[now] + 1) {
					check[now + i] = check[now] + 1;
					queue.add(now + i);
				}
			}
		}
		
		return check[n - 1] == Integer.MAX_VALUE ? -1 : check[n - 1];
	}
}
