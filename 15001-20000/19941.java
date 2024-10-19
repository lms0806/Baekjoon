import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	st.nextToken();
    	int k = Integer.parseInt(st.nextToken());
    	
    	char[] ch = br.readLine().toCharArray();
    	boolean[] check = new boolean[ch.length];
    	
    	int answer = 0;
    	for(int i = 0; i < ch.length; i++) {
    		if(ch[i] == 'H') {
    			continue;
    		}
    		
    		for(int j = Math.max(i - k, 0); j <= Math.min(i + k, ch.length - 1); j++) {
    			if(ch[j] == 'P') {
    				continue;
    			}
    			
    			if(!check[j]) {
    				check[j] = true;
    				answer++;
    				break;
    			}
    		}
    	}
    	System.out.print(answer);
    }
}
