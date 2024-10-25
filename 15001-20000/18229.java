import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
    	int k = Integer.parseInt(st.nextToken());
    	
    	int[][] arr = new int[n][m];
    	
    	for(int i = 0; i < n; i++) {
    		st = new StringTokenizer(br.readLine());
    		for(int j = 0; j < m; j++) {
    			arr[i][j] = Integer.parseInt(st.nextToken());
    		}
    	}
    	
    	int[] sum = new int[n];
    	
    	int num = 0, count = 0;
    	for(int i = 0; i < m; i++) {
    		for(int j = 0; j < n; j++) {
    			sum[j] += arr[j][i];
    			
    			if(sum[j] >= k) {
    				num = j + 1;
    				break;
    			}
    		}

    		if(num != 0) {
    			count = i + 1;
    			break;
    		}
    	}
    	System.out.print(num + " " + count);
    }
}
