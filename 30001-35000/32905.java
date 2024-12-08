import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        
        String answer = "Yes";
        while(n --> 0) {
        	st = new StringTokenizer(br.readLine());
        	int count = 0;
        	for(int i = 0; i < m; i++) {
        		if(st.nextToken().charAt(0) == 'A') {
        			count++;
        		}
        	}
        	
        	if(count != 1) {
        		answer = "No";
        		break;
        	}
        }
        System.out.print(answer);
    }
}
