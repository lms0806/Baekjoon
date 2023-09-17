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
        	
        	int j = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
        	
        	long[] arr = new long[n];
        	
        	for(int i = 0; i < n; i++) {
        		st = new StringTokenizer(br.readLine());
        		
        		arr[i] = Long.parseLong(st.nextToken()) * Long.parseLong(st.nextToken());
        	}
        	
        	Arrays.sort(arr);
        	
        	int answer = 0;
        	for(int i = n - 1; i >= 0; i--) {
        		if(j > 0) {
        			j -= arr[i];
        			answer++;
        		}
        	}
        	sb.append(answer).append("\n");
        }
        System.out.print(sb);
    }
}
