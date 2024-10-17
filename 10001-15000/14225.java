import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

class Main {
	static int n;
	static int[] arr;
	static TreeSet<Integer> set = new TreeSet<>();
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	n = Integer.parseInt(br.readLine());
    	
    	arr = new int[n];
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < n; i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	dfs(0, 0);
    	
    	int answer = 0;
    	for(int a : set) {
    		if(a != answer) {
    			break;
    		}
    		answer++;
    	}
    	
    	System.out.print(answer);
    }
    
    public static void dfs(int idx, int sum) {
    	if(idx == n) {
    		set.add(sum);
    		return;
    	}
    	
    	dfs(idx + 1, sum + arr[idx]);
    	dfs(idx + 1, sum);
    }
}
