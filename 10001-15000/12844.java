import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	static long[] arr, lazy, tree;
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	arr = new long[n];
    	lazy = new long[n << 2];
    	tree = new long[n << 2];
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < n; i++) {
    		arr[i] = Long.parseLong(st.nextToken());
    	}
    	
    	init(0, n - 1, 1);
    	
    	int t = Integer.parseInt(br.readLine());
    	
    	StringBuilder sb = new StringBuilder();
    	while(t --> 0) {
    		st = new StringTokenizer(br.readLine());
    		int op = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
    		
    		if(op == 1) {    			
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
    	
    	return tree[node] = init(s, mid, node << 1) ^ init(mid + 1, e, (node << 1) + 1);
    }
    
    public static void propagate(int s, int e, int node) {
    	if(lazy[node] != 0) {
    		if(s != e) {
    			lazy[node << 1] ^= lazy[node];
    			lazy[(node << 1) + 1] ^= lazy[node];
    		}
    		
    		if((e - s + 1) % 2 == 1) {
    			tree[node] ^= lazy[node];
    		}
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
    	
    	tree[node] = tree[node << 1] ^ tree[(node << 1) + 1]; 
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
    	
    	return sum(s, mid, node << 1, l, r) ^ sum(mid + 1, e, (node << 1) + 1, l, r);
    }
}
