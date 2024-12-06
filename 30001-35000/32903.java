import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        boolean[] alpha = new boolean[26];
        while(n --> 0) {
        	alpha[br.readLine().charAt(0) - 'a'] = true;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 26; i++) {
        	sb.append(alpha[i] ? (char)(i + 'a') : ".");
        	
        	if((i + 1) % 6 == 0) {
        		sb.append("\n");
        	}
        }
        System.out.print(sb);
    }
}
