import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[] ch = {'u', 'i', 'o', 'p', 'h', 'j', 'k', 'l', 'n', 'm'};
        
        int l = 0, r = 0;
        int uppercount = 0;
        for(char c : br.readLine().toCharArray()) {
        	if(c == ' ') {
        		uppercount++;
        	}
        	else {
        		if(c >= 'A' && c <= 'Z') {
        			uppercount++;
            		c = (char) (c - 'A' + 'a');
            	}
        		
        		boolean flag = false;
        		for(int i = 0; i < ch.length; i++) {
        			if(ch[i] == c) {
        				flag = true;
        				r++;
        				break;
        			}
        		}
        		
        		if(!flag) {
        			l++;
        		}
        	}
        }
        
        while(uppercount --> 0) {
        	if(r < l) {
        		r++;
        	}
        	else {
        		l++;
        	}
        }
        
        System.out.print(l + " " + r);
    }
}
