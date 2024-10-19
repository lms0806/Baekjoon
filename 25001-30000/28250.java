import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	long zero = 0, one = 0;
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < n; i++) {
    		int num = Integer.parseInt(st.nextToken());
    		
    		if(num == 0) {
    			zero++;
    		}
    		else if(num == 1) {
    			one++;
    		}
    	}
    	
    	System.out.print(zero * (one + n - zero) + (zero * (zero - 1) / 2));
    }
}
