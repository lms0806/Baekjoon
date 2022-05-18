import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken());
        
        System.out.print((solve(b) - solve(a + 8) + 9) % 9);
    }
    
    public static long solve(long x) {
    	x %= 9;
    	
    	long result = 0;
    	for(long i = 1; i <= x; i++) {
    		result += i;
    	}
    	
    	return result % 9;
    }
}
