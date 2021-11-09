import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, h;
	static int[] check, num;
	static ArrayList<Integer>[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		
		num = new int[h];
		check = new int[n];
		Arrays.fill(check, Integer.MAX_VALUE);
		
		arr = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < h; i++) {
			num[i] = Integer.parseInt(st.nextToken());
			check[num[i]] = 0;
		}
		
		for(int i = 0; i < l; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			arr[a].add(b);
			arr[b].add(a);
		}
		
		bfs();
		
		int answer = 0, max = 0;
		for(int i = 0; i < n; i++) {
			if(check[i] > max) {
				max = check[i];
				answer = i;
			}
		}
		System.out.print(answer);
	}
	
	public static void bfs() {
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i = 0; i < h; i++) {
			queue.add(num[i]);
		}
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			
			for(int temp : arr[now]) {
				if(check[temp] > check[now] + 1) {
					queue.add(temp);
					check[temp] = check[now] + 1;
				}
			}
		}
	}
}
