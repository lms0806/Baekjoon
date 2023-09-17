import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
        	for(char c : br.readLine().toCharArray()) {
        		if(c == 'd') {
        			sb.append(d == 1 ? 'q' : 'b');
        		}
        		else if(c == 'b') {
        			sb.append(d == 1 ? 'p' : 'd');
        		}
        		else if(c == 'q') {
        			sb.append(d == 1 ? 'd' : 'p');
        		}
        		else {
        			sb.append(d == 1 ? 'b' : 'q');
        		}
        	}
        	sb.append("\n");
        }
        System.out.print(sb);
    }
}
