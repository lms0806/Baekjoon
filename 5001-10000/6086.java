import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
	static int n;
	static int[][] arr = new int[52][52], f = new int[52][52];
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char a = st.nextToken().charAt(0), b = st.nextToken().charAt(0);
			int cost = Integer.parseInt(st.nextToken());
			
			int s = 'a' <= a && a <= 'z' ? a - 'a' + 26 : a - 'A';
			int e = 'a' <= b && b <= 'z' ? b - 'a' + 26 : b - 'A';
			
			arr[s][e] += cost;
			arr[e][s] += cost;
		}
		
		System.out.print(maxFlow(0, 25));
	}
	
	public static int maxFlow(int start, int end) {
		int[] d = new int[52];
		int answer = 0;
		while(true) {
			Queue<Integer> queue = new LinkedList<>();
			Arrays.fill(d, -1);
			d[start] = start;
			queue.add(start);
			
			while(!queue.isEmpty()) {
				int now = queue.poll();
				
				for(int i = 0; i < arr[now].length; i++) {
					if(arr[now][i] - f[now][i] > 0 && d[i] == -1) {
						queue.add(i);
						d[i] = now;
						
						if(i == end) {
							break;
						}
					}
				}
			}
			
			if(d[end] == -1) {
				break;
			}
			
			int flow = Integer.MAX_VALUE;
			for(int i = end; i != start; i = d[i]) {
				flow = Math.min(flow, arr[d[i]][i] - f[d[i]][i]);
			}
			
			for(int i = end; i != start; i = d[i]) {
				f[d[i]][i] += flow;
				f[i][d[i]] -= flow;
			}
			
			answer += flow;
		}
		return answer;
	}
}
