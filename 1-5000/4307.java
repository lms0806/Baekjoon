import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        while(t --> 0) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	
        	int len = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
        	
        	int[] arr = new int[n];
        	
        	int min = 0, max = 0;
        	for(int i = 0; i < n; i++) {
        		arr[i] = Integer.parseInt(br.readLine());
        		
        		min = Math.max(min, Math.min(arr[i], len - arr[i]));
        		max = Math.max(max, Math.max(arr[i], len - arr[i]));
        	}
        	
        	sb.append(min).append(" ").append(max).append("\n");
        }
        System.out.print(sb);
    }
}
