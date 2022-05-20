import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = "";
        StringBuilder sb = new StringBuilder();
        while((str = br.readLine()) != null) {
        	StringTokenizer st = new StringTokenizer(str);
        	int m = atoi(st.nextToken()), p = atoi(st.nextToken()), l = atoi(st.nextToken());
        	int e = atoi(st.nextToken());
        	int r = atoi(st.nextToken()), s = atoi(st.nextToken());
        	int n = atoi(st.nextToken());
        	
        	while(n --> 0) {
        		int larva = m * e, adult = p / s, pupa = l / r;
        		
        		m = adult;
        		p = pupa;
        		l = larva;
        	}
        	sb.append(m).append("\n");
        }
        System.out.print(sb);
    }
    
    public static int atoi(String s) {
    	return Integer.parseInt(s);
    }
}
