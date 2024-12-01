import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int t = Integer.parseInt(br.readLine());
    	
    	StringBuilder sb = new StringBuilder();
    	while(t --> 0) {
    		int n = Integer.parseInt(br.readLine());
    		
            double sum = 0;
    		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		for(int i = 0; i < n; i++) {
    			int num = Integer.parseInt(st.nextToken());
    			
    			max = Math.max(max, num);
    			min = Math.min(min, num);
    			sum += num;
    		}
    		
    		sb.append(Math.abs((max + min) / 2 - sum / n) < 1 ? "Yes" : "No").append("\n");
    	}
    	System.out.print(sb);
    }
}
