import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	static int n;
	static long[] arr, lazy, tree;
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
    	
    	arr = new long[n << 2];
    	lazy = new long[n << 2];
    	tree = new long[n << 2];
    	
    	for(int i = 0; i < n; i++) {
    		arr[i] = Long.parseLong(br.readLine());
    	}
    	
    	init(0, n - 1, 1);
    	
    	StringBuilder sb = new StringBuilder();
    	while(m --> 0) {
    		st = new StringTokenizer(br.readLine());
    		int a = Integer.parseInt(st.nextToken());
    		int l = Integer.parseInt(st.nextToken()) - 1, r = Integer.parseInt(st.nextToken()) - 1;
    		
    		if(a == 1) {
    			long d = Long.parseLong(st.nextToken());
    			
    			update(0, n - 1, 1, l, r, d);
    		}
    		else {
    			sb.append(sum(0, n - 1, 1, l, r)).append("\n");
    		}
    	}
    	System.out.print(sb);
    }
    
    public static long init(int s, int e, int node) {
    	if(s == e) {
    		return tree[node] = arr[s];
    	}
    	
    	int mid = (s + e) >> 1;
    	
    	return tree[node] = init(s, mid, node << 1) + init(mid + 1, e, (node << 1) + 1);
    }
    
    public static void propagate(int s, int e, int node) {
    	if(lazy[node] != 0) {
    		if(s != e) {
    			lazy[node << 1] += lazy[node];
    			lazy[(node << 1) + 1] += lazy[node];
    		}
    		tree[node] += lazy[node] * (e - s + 1);
    		lazy[node] = 0;
    	}
    }
    
    public static void update(int s, int e, int node, int l, int r, long dif) {
    	propagate(s, e, node);
    	if(e < l || r < s) {
    		return;
    	}
    	
    	if(l <= s && e <= r) {
    		lazy[node] = dif;
    		propagate(s, e, node);
    		return;
    	}
    	
    	int mid = (s + e) >> 1;
    	update(s, mid, node << 1, l, r, dif);
    	update(mid + 1, e, (node << 1) + 1, l, r, dif);
    	
    	tree[node] = tree[node << 1] + tree[(node << 1) + 1]; 
    }
    
    public static long sum(int s, int e, int node, int l, int r) {
    	propagate(s, e, node);
    	if(e < l || r < s) {
    		return 0;
    	}
    	
    	if(l <= s && e <= r) {
    		return tree[node];
    	}
    	
    	int mid = (s + e) >> 1;
    	
    	return sum(s, mid, node << 1, l, r) + sum(mid + 1, e, (node << 1) + 1, l, r);
    }
}
