import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, k;
	static int[] check = new int[100001];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		System.out.print(n == k ? 0 : bfs(n));
	}
	
	public static int bfs(int num) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(num);
		check[num] = 1;
		
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			
			for(int i = 0; i < 3; i++) {
				int next = i == 0 ? temp + 1 : i == 1 ? temp - 1 : temp * 2;
				
				if(next == k) {
					return check[temp];
				}
				
				if(next >= 0 && next < check.length && check[next] == 0) {
					queue.add(next);
					check[next] = check[temp] + 1;
				}
			}
		}
		return -1;
	}
}
