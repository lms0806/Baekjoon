import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken());
    	
    	int x = 0, y = 0;
    	try {
    		st = new StringTokenizer(br.readLine());
        	for(int i = 0; i < n - 1; i++) {
        		x += Integer.parseInt(st.nextToken());
        	}
    	} catch (NullPointerException ignore) {
    		
    	}
    	
    	try {
    		st = new StringTokenizer(br.readLine());
        	for(int i = 0; i < e - 1; i++) {
        		y += Integer.parseInt(st.nextToken());
        	}
    	} catch (NullPointerException ignore) {
    		
    	}
    	
    	int answer = (int) Math.sqrt(x * x + y * y);
    	if(answer * answer < x * x + y * y) {
    		answer++;
    	}
    	
    	System.out.print(answer);
    }
}
