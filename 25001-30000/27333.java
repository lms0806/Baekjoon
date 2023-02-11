import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        br.readLine();
        String s = br.readLine();
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	if(i < s.length() - 1 && c == s.charAt(i + 1)) {
        		sb.append((char)(c - 'a' + 'A')).append((char)(s.charAt(i + 1) - 'a' + 'A'));
        		i++;
        	}
        	else {
        		sb.append(c);
        	}
        }
        System.out.print(sb);
    }
}
