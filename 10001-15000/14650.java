import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	static int n, answer = 0;
	static int[] arr = {0, 1, 2};
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	n = Integer.parseInt(br.readLine());
    	
    	dfs(0, 0);
    	
    	System.out.print(answer);
    }
    
    public static void dfs(int num, int count) {
    	if(count == n) {
    		if(num > 0 && num % 3 == 0) {
    			answer++;
    		}
    		return;
    	}
    	
    	if(num != 0) {
    		dfs(num * 10, count + 1);
    	}
    	dfs(num * 10 + 1, count + 1);
    	dfs(num * 10 + 2, count + 1);
    }
}
