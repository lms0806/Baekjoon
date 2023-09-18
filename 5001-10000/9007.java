import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        while(t --> 0) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int k = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
        	
        	int[][] num = new int[4][n];
        	
        	for(int i = 0; i < 4; i++) {
        		st = new StringTokenizer(br.readLine());
        		for(int j = 0; j < n; j++) {
        			num[i][j] = Integer.parseInt(st.nextToken());
        		}
        	}
        	
        	int[][] arr = new int[2][n * n];
        	
        	int idx = 0;
        	for(int i = 0; i < n; i++) {
        		for(int j = 0; j < n; j++) {
        			arr[0][idx] = num[0][i] + num[1][j];
        			arr[1][idx++] = num[2][i] + num[3][j];
        		}
        	}
        	
        	Arrays.sort(arr[0]);
        	Arrays.sort(arr[1]);
        	
        	boolean flag = false;
        	int answer = Integer.MAX_VALUE;
        	for(int i = 0; i < arr[0].length; i++) {
        		int s = 0, e = arr[1].length - 1;
        		
        		while(s <= e) {
        			int mid = (s + e) / 2;
        			
        			int result = arr[1][mid] + arr[0][i];
        			
        			if(result == k) {
        				answer = result;
        				flag = true;
        				break;
        			}
        			
        			if(Math.abs(k - answer) == Math.abs(k - result)) {
        				answer = Math.min(answer, result);
        			}
        			else if(Math.abs(k - result) < Math.abs(k - answer)) {
        				answer = result;
        			}
        		
        			if(result < k) {
        				s = mid + 1;
        			}
        			else {
        				e = mid - 1;
        			}
        		}
        		
        		if(flag) {
        			break;
        		}
        	}
        	
        	sb.append(answer).append("\n");
        }
        System.out.print(sb);
    }
}
