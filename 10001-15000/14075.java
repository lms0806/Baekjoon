import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        
        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
        	int n = i % 2 == 0 ? (s.charAt(i) - '0') * 2 : s.charAt(i) - '0';
        	
        	if(n > 9) {
        		while(n != 0) {
        			sum += n % 10;
        			n /= 10;
        		}
        	}
        	else {
        		sum += n;
        	}
        }
        System.out.print(sum % 10 == 0 ? "DA" : "NE");
    }
}
