import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	static long[] arr, lazy, tree;
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
    	
    	int[] idx = new int[2000001];
    	arr = new long[2000001];
    	lazy = new long[n * 4];
    	tree = new long[n * 4];
    	
    	for(int i = 0; i < m; i++) {
    		st = new StringTokenizer(br.readLine());
    		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
    		long c = Long.parseLong(st.nextToken());
    		
    		for(int j = a; j <= b; j++) {
    			idx[j - 1] = i;
    			arr[i] = c;
    		}
    	}
    	
    	init(0, m - 1, 1);
    	
    	StringBuilder sb = new StringBuilder();
    	while(true) {
    		st = new StringTokenizer(br.readLine());
    		int op = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
    		
    		if(op + x + y == 0) {
    			break;
    		}
    		
    		if(op == 1) {
    			long answer = 0;
    			if(y < x) {
    				answer += sum(0, m - 1, 1, 0, idx[y - 1]);
    				answer += sum(0, m - 1, 1, idx[x - 1], m - 1);
    			}
    			else {
    				answer = sum(0, m - 1, 1, idx[x - 1], idx[y - 1]);
    			}
    			sb.append(answer).append("\n");
    		}
    		else {
    			long z = Long.parseLong(st.nextToken());
    			
    			if(y < x) {
    				update(0, m - 1, 1, 0, idx[y - 1], z);
    				update(0, m - 1, 1, idx[x - 1], m - 1, z);
    			}
    			else {
    				update(0, m - 1, 1, idx[x - 1], idx[y - 1], z);
    			}
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
