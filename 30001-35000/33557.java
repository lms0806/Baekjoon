import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int t = Integer.parseInt(br.readLine());
    	
    	StringBuilder sb = new StringBuilder();
    	while(t --> 0) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken());
            long p = 1, res = -a * b;
            
            while(true) {
            	if(a <= 0 && b <= 0) {
            		break;
            	}
            	
            	long num = (a > 0 ? a % 10 : 1) * (b > 0 ? b % 10 : 1);
                
                res += num * p;
                
                if (num >= 10) {
                	p *= 10;
                }
            	
            	a /= 10;
            	b /= 10;
            	p *= 10;
            }
            sb.append(res == 0 ? 1 : 0).append("\n");
        }
    	System.out.print(sb);
    }
}
