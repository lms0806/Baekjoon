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
    		
    		char[] a = st.nextToken().toCharArray(), b = st.nextToken().toCharArray();
    		
    		int one = 0, zero = 0;
    		for(int i = 0; i < a.length; i++) {
    			if(a[i] != b[i]) {
    				if(a[i] == '1') {
    					one++;
    				}
    				else {
    					zero++;
    				}
    			}
    		}
    		sb.append(Math.max(zero, one)).append("\n");
    	}
    	System.out.print(sb);
    }
}
