import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] tree, arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		arr = new int[n + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		tree = new int[n * 4];
		
		init(1, n, 1);
		
		int m = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			
			if(a == 1) {
				int b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
				arr[b] = c;
				update(1, n, 1, b, c);
			}
			else {
				sb.append(min(1, n, 1, 0, n)).append("\n");
			}
		}
		System.out.print(sb);
	}
	
	public static int init(int start, int end, int node) {
		if(start == end) {
			return tree[node] = start;
		}
		
		int mid = (start + end) / 2;
		
		return tree[node] = minidx(init(start, mid, node * 2), init(mid + 1, end, node * 2 + 1));
	}
	
	public static int update(int start, int end, int node, int idx, int val) {
		if(idx < start || idx > end || start == end) {
			return tree[node];
		}
		
		int mid = (start + end) / 2;
		
		return tree[node] = minidx(update(start, mid, node * 2, idx, val), update(mid + 1, end, node * 2 + 1, idx, val));
	}
	
	public static int min(int start, int end, int node, int left, int right) {
		if(left > end || right < start) {
			return -1;
		}
		
		if(left <= start && end <= right) {
			return tree[node];
		}
		
		int mid = (start + end) / 2;
		
		return minidx(min(start, mid, node * 2, left, right), min(mid + 1, end, node * 2 + 1, left, right));
	}
	
	public static int minidx(int a, int b) {
		if(a == -1) {
			return b;
		}
		if(b == -1) {
			return a;
		}
		return arr[a] <= arr[b] ? a : b;
	}
}
