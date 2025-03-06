import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int t = Integer.parseInt(br.readLine());
    	
    	StringBuilder sb = new StringBuilder();
    	while(t --> 0) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		
    		sb.append(solve(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())) ? "YES" : "NO").append("\n");
    	}
    	System.out.print(sb);
    }
    
    public static boolean solve(int a, int b, int c, int d) {
    	int[] x = {0, 0, 0, 0, 1, 1, 1, 1}, y = {0, 0, 1, 1, 0, 0, 1, 1}, z = {0, 1, 0, 1, 0, 1, 0, 1};
    	
    	return (x[a] == x[b] && x[b] == x[c] && x[c] == x[d] && x[d] == x[a]) || (y[a] == y[b] && y[b] == y[c] && y[c] == y[d] && y[d] == y[a]) || (z[a] == z[b] && z[b] == z[c] && z[c] == z[d] && z[d] == z[a]);
    }
}
