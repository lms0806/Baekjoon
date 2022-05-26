import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        while(true) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int b = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
        	
        	if(b == 0 && n == 0) {
        		break;
        	}
        	
        	int k = (int) Math.pow(b,  1.0 / n);
        	int p = (int) Math.abs((b - Math.pow(k, n)));
        	int q = (int) Math.abs((b - Math.pow(k + 1, n)));
        	
        	sb.append(p < q ? k : k + 1).append("\n");
        }
        System.out.print(sb);
    }
}
