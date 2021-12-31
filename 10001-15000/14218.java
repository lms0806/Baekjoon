import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static int[][] arr;
	static int[] num;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n + 1][n + 1];
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			arr[a][b] = arr[b][a] = 1;
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			arr[a][b] = arr[b][a] = 1;
			
			num = new int[n + 1];
			Arrays.fill(num, -1);
			
			bfs();
			
			for(int i = 1; i <= n; i++) {
				sb.append(num[i]).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	public static void bfs() {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		num[1] = 0;
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			
			for(int i = 1; i <= n; i++) {
				if(arr[now][i] == 1 && num[i] == -1) {
					num[i] = num[now] + 1;
					queue.add(i);
				}
			}
		}
	}
}
