import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        while(t --> 0) {
        	int n = Integer.parseInt(br.readLine());
        	
        	char[] ch = br.readLine().toCharArray(), ch1 = br.readLine().toCharArray();
        	
        	int b = 0, w = 0;
        	for(int i = 0; i < n; i++) {
        		if(ch[i] == ch1[i]) {
        			continue;
        		}
        		
        		if(ch[i] == 'B') {
        			b++;
        		}
        		else {
        			w++;
        		}
        	}
        	sb.append(Math.max(b, w)).append("\n");
        }
        System.out.print(sb);
    }
}
