import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        
        int[][] arr = new int[n][2];
        
        for(int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine());
        	arr[i][0] = Integer.parseInt(st.nextToken());
        	arr[i][1] = Integer.parseInt(st.nextToken());
        }
        
        int answer = 0;
        int x = 0, y = 0;
        while(m --> 0) {
        	int idx = 0, max = 0;
        	for(int i = 0; i < n; i++) {
        		if(max < Math.pow(arr[i][0] - x, 2) + Math.pow(arr[i][1] - y, 2)) {
        			max = (int) (Math.pow(arr[i][0] - x, 2) + Math.pow(arr[i][1] - y, 2));
        			idx = i;
        		}
        	}
        	
        	answer += max;
        	x = arr[idx][0];
        	y = arr[idx][1];
        	
        	st = new StringTokenizer(br.readLine());
        	arr[idx][0] = Integer.parseInt(st.nextToken());
        	arr[idx][1] = Integer.parseInt(st.nextToken());
        }
        System.out.print(answer);
    }
}
