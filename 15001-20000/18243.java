import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int[] check;
	static ArrayList<Integer>[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		while(k --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			arr[a].add(b);
			arr[b].add(a);
		}
		
		check = new int[n + 1];
		
		String answer = "Small World!";
		for(int i = 1; i <= n; i++) {
			Arrays.fill(check, -1);
			bfs(i);
			for(int j = 1; j <= n; j++) {
				if(check[j] == -1 || check[j] > 6) {
					answer = "Big World!";
					break;
				}
			}
		}
		System.out.print(answer);
	}
	
	public static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		check[start] = 0;
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			
			for(int temp : arr[now]) {
				if(check[temp] == -1) {
					queue.add(temp);
					check[temp] = check[now] + 1;
				}
			}
		}
	}
}
