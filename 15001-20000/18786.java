import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        int[][] arr = new int[n][2];
        
        for(int i = 0; i < n; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for(int j = 0; j < 2; j++) {
        		arr[i][j] = Integer.parseInt(st.nextToken());
        	}
        }
        
        int answer = 0;
        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < n; j++) {
        		if(i == j) {
        			continue;
        		}
        		
        		for(int k = 0; k < n; k++) {
        			if(i == k || j == k) {
        				continue;
        			}
        			
        			if(arr[i][0] == arr[j][0] && arr[i][1] == arr[k][1]) {
        				answer = Math.max(answer, Math.abs(arr[i][0] - arr[k][0]) * Math.abs(arr[i][1] - arr[j][1]));
        			}
        		}
        	}
        }
        System.out.print(answer);
    }
}
