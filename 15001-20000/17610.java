import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

class Main {
	static int[] arr;
	static int total, n;
	static HashSet<Integer> set = new HashSet<>();
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	n = Integer.parseInt(br.readLine());
    	
    	arr = new int[n];
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < n; i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
    		total += arr[i];
    	}
    	
    	dfs(0, 0);
    	
    	System.out.print(total - set.size());
    }
    
    public static void dfs(int idx, int sum) {
    	if(idx == n) {
    		if(0 < sum && sum <= total) {
    			set.add(sum);
    		}
    		return;
    	}
    	
    	dfs(idx + 1, sum + arr[idx]);
    	dfs(idx + 1, sum - arr[idx]);
    	dfs(idx + 1, sum);
    	
    }
}
