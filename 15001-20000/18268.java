import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
    	
    	int[][] arr = new int[m][n];
    	
    	for(int i = 0; i < m; i++) {
    		st = new StringTokenizer(br.readLine());
    		for(int j = 0; j < n; j++) {
    			arr[i][Integer.parseInt(st.nextToken()) - 1] = j;
    		}
    	}
    	
    	int answer = 0;
    	for(int i = 0; i < n; i++) {
    		for(int j = 0; j < n; j++) {
    			if(i == j) {
    				continue;
    			}
    			
    			boolean flag = false;
    			for(int k = 0; k < m; k++) {
    				if(arr[k][i] > arr[k][j]) {
    					flag = true;
    					break;
    				}
    			}
    			
    			if(!flag) {
    				answer++;
    			}
    		}
    	}
    	
    	System.out.print(answer);
    }
}
