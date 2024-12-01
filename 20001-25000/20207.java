import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	int[] num = new int[366];
    	
    	while(n --> 0) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
    		
    		for(int i = a; i <= b; i++) {
    			num[i]++;
    		}
    	}
    	
    	int answer = 0, len = 0, max = 0;
    	for(int i = 0; i < num.length; i++) {
    		if(num[i] == 0) {
    			answer += max * len;
    			len = max = 0;
    		}
    		else {
    			len++;
    			max = Math.max(max, num[i]);
    		}
    	}
    	System.out.print(answer + max * len);
    }
}
