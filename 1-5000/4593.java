import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        while(true) {
        	String s = br.readLine(), s1 = br.readLine();
        	
        	if(s.equals("E") && s1.equals("E")) {
        		break;
        	}
        	
        	int a = 0, b = 0;
        	for(int i = 0; i < s.length(); i++) {
        		char c = s.charAt(i), c1 = s1.charAt(i);
        		
        		if((c == 'P' && c1 == 'R') || (c == 'R' && c1 == 'S') || (c == 'S' && c1 == 'P')) {
        			a++;
        		}
        		if((c1 == 'P' && c == 'R') || (c1 == 'R' && c == 'S') || (c1 == 'S' && c == 'P')) {
        			b++;
        		}
        	}
        	
        	sb.append("P1: ").append(a).append("\n");
        	sb.append("P2: ").append(b).append("\n");
        }
        System.out.print(sb);
    }
}
