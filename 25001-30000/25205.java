import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        br.readLine();
        
        System.out.print(solve(br.readLine()));
    }
    
    public static int solve(String s) {
        for(char c : "qwertasdfgzxcv".toCharArray()) {
        	if(c == s.charAt(s.length() - 1)) {
        		return 1;
        	}
        }
        
        return 0;
    }
}
