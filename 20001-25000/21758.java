import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	int[] arr = new int[n + 1], sum = new int[n + 1];
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for(int i = 1; i <= n; i++) {
    		arr[i] = sum[i] = Integer.parseInt(st.nextToken());
    		
    		if(i > 0) {
    			sum[i] += sum[i - 1];
    		}
    	}
    	
    	int answer = 0;
    	for(int i = 2; i < n; i++) {
    		answer = Math.max(answer, sum[n] - arr[1] - arr[i] + sum[n] - sum[i]);
    		answer = Math.max(answer, sum[i] - arr[1] + sum[n - 1] - sum[i - 1]);
    		answer = Math.max(answer, sum[i - 1] + sum[n - 1] - arr[i]);
    	}
    	System.out.print(answer);
    }
}
