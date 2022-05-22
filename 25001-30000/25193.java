import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int s = 0;
        for(char c : br.readLine().toCharArray()) {
        	if(c == 'C') {
        		s++;
        	}
        }
        
        System.out.print(n / (n - s + 1));
    }
}
