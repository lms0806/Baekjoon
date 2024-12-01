import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken());
    	int c = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken());
    	
    	int now = 1, answer = now == s ? 1 : 0;
    	
    	st = new StringTokenizer(br.readLine());
    	while(c --> 0) {
    		int num = Integer.parseInt(st.nextToken());
    		
    		now += num;
    		
    		if(now > n) {
    			now = 1;
    		}
    		else if(now < 1) {
    			now = n;
    		}
    		
    		if(now == s) {
    			answer++;
    		}
    	}
    	System.out.print(answer);
    }
}
