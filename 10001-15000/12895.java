import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	static int[] lazy, tree;
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken());
    	st.nextToken();
    	int q = Integer.parseInt(st.nextToken());
    	
    	lazy = new int[n << 2];
    	tree = new int[n << 2];
    	
    	update(1, n, 1, 1, n, 1);
    	
    	StringBuilder sb = new StringBuilder();
    	while(q --> 0) {
    		st = new StringTokenizer(br.readLine());
    		char c = st.nextToken().charAt(0);
    		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
    		
    		if(x > y) {
    			int tmp = x;
    			x = y;
    			y = tmp;
    		}
    		
    		if(c == 'C') {
    			update(1, n, 1, x, y, 1 << (Integer.parseInt(st.nextToken()) - 1));
    		}
    		else {
    			long num = query(1, n, 1, x, y);
    			
    			int answer = 0;
    			while(num > 0) {
    				answer += (num & 1);
    				num >>= 1;
    			}
    			sb.append(answer).append("\n");
    		}
    	}
    	System.out.print(sb);    	
    }
    
    public static void propagate(int s, int e, int node) {
    	if(lazy[node] != 0) {
    		if(s != e) {
    			lazy[node << 1] = lazy[node];
    			lazy[(node << 1) + 1] = lazy[node];
    		}
    		
    		tree[node] = lazy[node];
    		lazy[node] = 0;
    	}
    }
    
    public static void update(int s, int e, int node, int l, int r, int dif) {
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
    	
    	tree[node] = tree[node << 1] | tree[(node << 1) + 1]; 
    }
    
    public static long query(int s, int e, int node, int l, int r) {
    	propagate(s, e, node);
    	if(e < l || r < s) {
    		return 0;
    	}
    	
    	if(l <= s && e <= r) {
    		return tree[node];
    	}
    	
    	int mid = (s + e) >> 1;
    	
    	return query(s, mid, node << 1, l, r) | query(mid + 1, e, (node << 1) + 1, l, r);
    }
}
