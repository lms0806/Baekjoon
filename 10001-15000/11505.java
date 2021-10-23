import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static long[] tree, arr;
	static int mod = 1000000007;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
		
		arr = new long[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = Long.parseLong(br.readLine());
		}
		
		tree = new long[n * 4];
		
		init(1, n, 1);
		
		StringBuilder sb = new StringBuilder();
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			long c = Long.parseLong(st.nextToken());
			
			if(a == 1) {
				arr[b] = c;
				update(1, n, 1, b, c);
			}
			else {
				sb.append(mul(1, n, 1, b, (int) c)).append("\n");
			}
		}
		System.out.print(sb);
	}
	
	public static long init(int start, int end, int node) {
		if(start == end) {
			return tree[node] = arr[start];
		}
		
		int mid = (start + end) / 2;
		
		return tree[node] = init(start, mid, node * 2) * init(mid + 1, end, node * 2 + 1) % mod;
	}
	
	public static long mul(int start, int end, int node, int left, int right) {
		if(left > end || right < start) {
			return 1;
		}
		
		if(left <= start && end <= right) {
			return tree[node];
		}
		
		int mid = (start + end) / 2;
		
		return mul(start, mid, node * 2, left, right) * mul(mid + 1, end, node * 2 + 1, left, right) % mod;
	}
	
	public static long update(int start, int end, int node, int idx, long val) {
		if(idx < start || idx > end) {
			return tree[node];
		}
		
		if(start == end) {
			return tree[node] = val;
		}
		
		int mid = (start + end) / 2;
		
		return tree[node] = update(start, mid, node * 2, idx, val) * update(mid + 1, end, node * 2 + 1, idx, val) % mod;
	}
}
