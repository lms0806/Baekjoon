import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        br.readLine();
        String a = br.readLine(), b = br.readLine();
        char[] c = new char[a.length() + b.length()];
        
        a = new StringBuilder(a).reverse().toString();
        
        for(int i = 0; i < a.length(); i++) {
        	c[i] = a.charAt(i);
        }
        for(int i = a.length(); i < c.length; i++) {
        	c[i] = b.charAt(i - a.length());
        }
        
        int t = Integer.parseInt(br.readLine());
        
        while(t --> 0) {
        	for(int i = 0; i < c.length - 1; i++) {
        		if(a.contains(c[i] + "") && b.contains(c[i + 1] + "")) {
        			char ch = c[i];
        			c[i] = c[i + 1];
        			c[i + 1] = ch;

            		if(c[i + 1] == a.charAt(a.length() - 1)) {
            			break;
            		}
        		}
        	}
        }
        System.out.print(c);
    }
}
