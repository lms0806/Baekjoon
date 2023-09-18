import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        st.nextToken();
        int t = Integer.parseInt(st.nextToken());
        
        String s = br.readLine();
        
        StringBuilder sb = new StringBuilder();
        while(t --> 0) {
        	int idx = 0;
        	for(char c : br.readLine().toCharArray()) {
        		if(c == s.charAt(idx)) {
        			idx++;
        		}
        		
        		if(s.length() == idx) {
        			break;
        		}
        	}
        	
        	sb.append(s.length() == idx ? "true" : "false").append("\n");
        }
        System.out.print(sb);
    }
}
