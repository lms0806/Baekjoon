import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        while(t --> 0) {
        	String s = br.readLine();
        	
        	int n = Integer.parseInt(s.substring(s.length() - 3)) * 10;
        	
        	for(char c : s.toCharArray()) {
        		n += c - '0';
        	}
        	
        	if(n < 1000) {
        		n += 1000;
        	}
        	
        	String answer = String.valueOf(n);
        	
        	sb.append(answer.substring(answer.length() - 4)).append("\n");
        }
        System.out.print(sb);
    }
}
