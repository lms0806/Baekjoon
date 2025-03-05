import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	boolean[] flag = new boolean[n];
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < n; i++) {
    		flag[i] = Integer.parseInt(st.nextToken()) == 1;
    	}
    	
    	int answer = 0;
    	for(int i = 0; i < n; i++) {
    		st = new StringTokenizer(br.readLine());
    		
    		if(flag[i]) {
        		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        		
        		if(b > a) {
        			answer += b - a;
        		}
    		}
    	}
    	System.out.print(answer);
    }
}
