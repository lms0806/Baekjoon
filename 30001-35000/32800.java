import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	int answer = 0, sum = 0;
    	while(n --> 0) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		sum += -Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
    		
    		answer = Math.max(answer, sum);
    	}
    	System.out.print(answer);
    }
}
