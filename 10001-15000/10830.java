import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        
        int[][] arr = new int[n][n], result = new int[n][n];
        
        for(int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine());
        	for(int j = 0; j < n; j++) {
        		arr[i][j] = Integer.parseInt(st.nextToken());
        	}
        	result[i][i] = 1;
        }
        
        while(b > 0) {
        	if(b % 2 == 1) {
        		result = multiply(result, arr);
        	}
        	
        	arr = multiply(arr, arr);
        	b /= 2;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < n; j++) {
        		sb.append(result[i][j]).append(" ");
        	}
        	sb.append("\n");
        }
        System.out.print(sb);
    }
    
    public static int[][] multiply(int[][] a, int[][] b){
    	int[][] result = new int[n][n];
    	
    	for(int i = 0; i < n; i++) {
    		for(int j = 0; j < n; j++) {
    			for(int k = 0; k < n; k++) {
    				result[i][j] += a[i][k] * b[k][j];
    				result[i][j] %= 1000;
    			}
    		}
    	}
    	return result;
    }
}
