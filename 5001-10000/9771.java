import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        String word = br.readLine();
        
        String s;
        int answer = 0;
        while((s = br.readLine()) != null) {
        	StringTokenizer st = new StringTokenizer(s);
        	
        	while(st.hasMoreTokens()) {
        		if(st.nextToken().contains(word)) {
        			answer++;
        		}
        	}
        }
        System.out.print(answer);
    }
}
