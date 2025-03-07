import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	static long[] arr, lazy, tree, mintree;
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
    	
    	arr = new long[n];
    	lazy = new long[n << 2];
    	tree = new long[n << 2];
    	mintree = new long[n << 2];
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < n; i++) {
    		arr[i] = Long.parseLong(st.nextToken());
    	}
    	
    	init(0, n - 1, 1);
    	init2(0, n - 1, 1);
    	
    	StringBuilder sb = new StringBuilder();
    	while(q --> 0) {
    		st = new StringTokenizer(br.readLine());
    		char op = st.nextToken().charAt(0);
    		int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken()) - 1;
    		
    		if(op == 'M') {
    			sb.append(min(0, n - 1, 1, a, b)).append("\n");
    		}
    		else if(op == 'P') {
    			update(0, n - 1, 1, a, b, Long.parseLong(st.nextToken()));
    		}
    		else {
    			sb.append(sum(0, n - 1, 1, a, b)).append("\n");
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
    
    public static long init2(int s, int e, int node) {
    	if(s == e) {
    		return mintree[node] = arr[s];
    	}
    	
    	int mid = (s + e) >> 1;
    	
    	return mintree[node] = Math.min(init2(s, mid, node << 1), init2(mid + 1, e, (node << 1) + 1));
    }
    
    public static void propagate(int s, int e, int node) {
    	if(lazy[node] != 0) {
    		if(s != e) {
    			lazy[node << 1] += lazy[node];
    			lazy[(node << 1) + 1] += lazy[node];
    		}
    		mintree[node] += lazy[node];
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
    	
    	mintree[node] = Math.min(mintree[node << 1], mintree[(node << 1) + 1]);
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
    
    public static long min(int s, int e, int node, int l, int r) {
    	propagate(s, e, node);
    	if(e < l || r < s) {
    		return Long.MAX_VALUE;
    	}
    	
    	if(l <= s && e <= r) {
    		return mintree[node];
    	}
    	
    	int mid = (s + e) >> 1;
    	
    	return Math.min(min(s, mid, node << 1, l, r), min(mid + 1, e, (node << 1) + 1, l, r));
    }
}
