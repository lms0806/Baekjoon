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
    		int[] a = new int[5], b = new int[5];
    		
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		for(int i = 0; i < 5; i++) {
    			a[i] = Integer.parseInt(st.nextToken());
    		}
    		
    		st = new StringTokenizer(br.readLine());
    		for(int i = 0; i < 5; i++) {
    			b[i] = Integer.parseInt(st.nextToken());
    		}
    		
    		sb.append(solve(a, b)).append("\n");
    	}
    	System.out.print(sb);
    }
    
    public static String solve(int[] a, int[] b) {
    	for(int i = 0; i < a.length; i++) {
    		for(int j = 0; j < b.length; j++) {
    			if(i == j) {
    				continue;
    			}
    			
    			if(a[i] == b[j]) {
    				return "YES";
    			}
    		}
    	}
    	return "NO";
    }
}
