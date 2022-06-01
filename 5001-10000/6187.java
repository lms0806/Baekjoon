import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	static int num, answer = 0;
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        num = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        
        arr = new int[n];
        
        for(int i = 0; i < n; i++) {
        	arr[i] = Integer.parseInt(br.readLine());
        }
        
        for(int i = 0; i < n; i++) {
        	dfs(i, arr[i]);
        }
        
        System.out.print(answer);
    }
    
    public static void dfs(int depth, int sum) {
    	if(sum <= num) {
    		answer = Math.max(sum, answer);
    	}
    	
    	for(int i = depth + 1; i < arr.length; i++) {
    		dfs(i, sum + arr[i]);
    	}
    }
}
