import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = 1;
        StringBuilder sb = new StringBuilder();
        while(true) {
        	String s = br.readLine();
        	
        	if("0".equals(s)) {
        		break;
        	}
        	
        	HashSet<String> set = new HashSet<>();
        	set.add(s);
        	while(true) {
        		if(s.length() % 2 == 1) {
        			break;
        		}
        		
            	StringBuilder str = new StringBuilder();
            	for(int i = 0; i < s.length(); i += 2) {
            		str.append((s.charAt(i + 1) + "").repeat(s.charAt(i) - '0'));
            	}
            	s = str.toString();
            	
            	if(set.contains(s)) {
            		break;
            	}
            	
            	set.add(s);
        	}
        	sb.append(String.format("Test %d: %s\n", t++, s));
        }
        System.out.print(sb);
    }
}
