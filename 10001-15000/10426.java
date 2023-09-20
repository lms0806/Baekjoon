import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String[] s = st.nextToken().split("-");
        int y = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int d = Integer.parseInt(s[2]) + Integer.parseInt(st.nextToken()) - 1;
        
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        while(true) {
        	if(d < days[m - 1] + 1 || (check(y) && d < 30)) {
        		break;
        	}
        	
        	if(m == 2) {
        		d -= check(y) ? 29 : 28;
        	}
        	else {
        		d -= days[m - 1];
        	}
        	
        	m++;
        	
        	if(m > 12) {
        		y++;
        		m -= 12;
        	}
        }
        System.out.print(y + "-" + print(m) + "-" + print(d));
    }
    
    public static boolean check(int y) {
    	return (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
    }
    
    public static String print(int n) {
    	return String.format("%02d", n);
    }
}
