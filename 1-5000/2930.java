import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	br.readLine();
    	char[] arr = br.readLine().toCharArray();
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	char[][] friend = new char[n][];
    	
    	for(int i = 0; i < n; i++) {
    		friend[i] = br.readLine().toCharArray();
    	}
    	
    	int a = 0, b = 0;
    	for(int j = 0; j < friend[0].length; j++) {
    		int r = 0, s = 0, p = 0;
    		for(int i = 0; i < n; i++) {
    			r += checkWin('R', friend[i][j]);
    			s += checkWin('S', friend[i][j]);
    			p += checkWin('P', friend[i][j]);
    			
    			a += checkWin(arr[j], friend[i][j]);
    		}
    		
    		b += Math.max(r, Math.max(s, p));
    	}
    	System.out.print(a + "\n" + b);
    }
    
    public static int checkWin(int ch, int ch1) {
    	return ((ch == 'S' && ch1 == 'P') || (ch == 'R' && ch1 == 'S') || (ch == 'P' && ch1 == 'R')) ? 2 : ch == ch1 ? 1 : 0;
    }
}
