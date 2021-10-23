import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	static long[] tree;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		arr = new int[n + 1];
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		tree = new long[n * 4];
		
		init(1, n, 1);
		
		StringBuilder sb = new StringBuilder();
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken()), a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			if(x > y) {
				int temp = y;
				y = x;
				x = temp;
			}
			
			sb.append(sum(1, n, 1, x, y)).append("\n");
			update(1, n, 1, a, b);
		}
		System.out.print(sb);
	}
	
	public static long init(int start, int end, int node) {
		if(start == end) {
			return tree[node] = arr[start];
		}
		
		int mid = (start + end) / 2;
		
		return tree[node] = init(start, mid, node * 2) + init(mid + 1, end, node * 2 + 1);
	}
	
	public static long update(int start, int end, int node, int idx, long val) {
		if(idx < start || idx > end) {
			return tree[node];
		}
		
		if(start == end) {
			return tree[node] = val;
		}
		
		int mid = (start + end) / 2;
		
		return tree[node] = update(start, mid, node * 2, idx, val) + update(mid + 1, end, node * 2 + 1, idx, val);
	}
	
	public static long sum(int start, int end, int node, int left, int right) {
		if(left > end || right < start) {
			return 0;
		}
		
		if(left <= start && end <= right) {
			return tree[node];
		}
		
		int mid = (start + end) / 2;
		
		return sum(start, mid, node * 2, left, right) + sum(mid + 1, end, node * 2 + 1, left, right);
	}
}
