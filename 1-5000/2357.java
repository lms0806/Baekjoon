import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static long[] mintree, maxtree, arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		arr = new long[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = Long.parseLong(br.readLine());
		}
		
		mintree = new long[n * 4];
		maxtree = new long[n * 4];
		
		mininit(1, n, 1);
		maxinit(1, n, 1);
		
		StringBuilder sb = new StringBuilder();
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			sb.append(min(1, n, 1, a, b)).append(" ").append(max(1, n, 1, a, b)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static long mininit(int start, int end, int node) {
		if(start == end) {
			return mintree[node] = arr[start];
		}
		
		int mid = (start + end) / 2;
		
		return mintree[node] = Math.min(mininit(start, mid, node * 2), mininit(mid + 1, end, node * 2 + 1));
	}
	
	public static long min(int start, int end, int node, int left, int right) {
		if(left > end || right < start) {
			return Integer.MAX_VALUE;
		}
		
		if(left <= start && end <= right) {
			return mintree[node];
		}
		
		int mid = (start + end) / 2;
		
		return Math.min(min(start, mid, node * 2, left, right), min(mid + 1, end, node * 2 + 1, left, right));
	}
	
	public static long maxinit(int start, int end, int node) {
		if(start == end) {
			return maxtree[node] = arr[start];
		}
		
		int mid = (start + end) / 2;
		
		return maxtree[node] = Math.max(maxinit(start, mid, node * 2), maxinit(mid + 1, end, node * 2 + 1));
	}
	
	public static long max(int start, int end, int node, int left, int right) {
		if(left > end || right < start) {
			return 0;
		}
		
		if(left <= start && end <= right) {
			return maxtree[node];
		}
		
		int mid = (start + end) / 2;
		
		return Math.max(max(start, mid, node * 2, left, right), max(mid + 1, end, node * 2 + 1, left, right));
	}
}
