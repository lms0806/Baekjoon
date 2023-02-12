import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        StringBuilder sb = new StringBuilder();
        while(true) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	double a = Double.parseDouble(st.nextToken()), b = Double.parseDouble(st.nextToken());
        	
        	if(a == 0 || b == 0) {
        		sb.append("AXIS");
        	}
        	else {
        		sb.append("Q");
        		if(a > 0) {
        			sb.append(b > 0 ? 1 : 4);
        		}
        		else {
        			sb.append(b > 0 ? 2 : 3);
        		}
        	}
        	sb.append("\n");
        	
        	if(a == 0 && b == 0) {
        		break;
        	}
        }
        System.out.print(sb);
    }
}
