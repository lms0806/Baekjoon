import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        br.readLine();
        System.out.print(solve(br.readLine()));
    }
    
    public static String solve(String s) {
    	int count = 1;
        for(int i = 0; i < s.length() - 1; i++) {
        	if(Math.abs(s.charAt(i) - s.charAt(i + 1)) == 1) {
        		count++;
        	}
        	else {
        		count = 1;
        	}
        	
        	if(count == 5) {
        		return "YES";
        	}
        }
        return "NO";
    }
}
