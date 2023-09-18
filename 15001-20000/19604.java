import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        int mina = 101, minb = 101;
        int maxa = -1, maxb = -1;
        while(t --> 0) {
        	StringTokenizer st = new StringTokenizer(br.readLine(), ",");
        	
        	int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        	
        	mina = Math.min(mina, a - 1);
        	minb = Math.min(minb, b - 1);
        	
        	maxa = Math.max(maxa, a + 1);
        	maxb = Math.max(maxb, b + 1);
        }
        
        System.out.print(mina + "," + minb + "\n" + maxa + "," + maxb);
    }
}
