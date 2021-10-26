import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, k, answer = 0, minTime = Integer.MAX_VALUE;
	static int[] check = new int[100001];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		if(n == k) {
			sb.append(0).append("\n").append(1);
		}
		else {
			bfs();
			sb.append(minTime).append("\n").append(answer);
		}
		System.out.print(sb);
	}
	
	public static void bfs() {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(n);
		check[n] = 1;
		
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			
			if(minTime < check[temp]) {
				return;
			}
			
			for(int i = 0; i < 3; i++) {
				int next = i == 0 ? temp + 1 : i == 1 ? temp - 1 : temp * 2;
				
				if(next == k) {
					minTime = check[temp];
					answer++;
				}
				
				if(next >= 0 && next < check.length && (check[next] == 0 || check[next] == check[temp] + 1)) {
					queue.add(next);
					check[next] = check[temp] + 1;
				}
			}
		}
	}
}
