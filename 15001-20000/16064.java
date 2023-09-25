import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][n];
        
        for(int i = 0; i < n; i++) {
        	Arrays.fill(arr[i], -987654321);
        }
        
        int answer = 0;
        while(m --> 0) {
        	st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken()) - 1;
        	int c = Integer.parseInt(st.nextToken());
        	
        	if(arr[a][b] < c) {
        		arr[a][b] = c;
        		
        		if(answer < arr[a][b]) {
        			answer = arr[a][b];
        		}
        	}
        }

        for(int k = 0; k < n; k++){
            for(int i = 0; i < n; i++){       
            	if(arr[i][k] == -987654321) {
            		continue;
            	}
            	
                for(int j = 0; j < n; j++){     
                	if(arr[k][j] == -987654321) {
                		continue;
                	}
                	
                	if(arr[i][j] < arr[i][k] + arr[k][j]) {
                		arr[i][j] = arr[i][k] + arr[k][j];

                    	answer = Math.max(answer, arr[i][j]);
                	}
                }
            }
        }
        
        System.out.print(answer);
    }
}
