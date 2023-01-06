import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= t; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	st.nextToken();
        	
        	int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        	int c = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
        	
        	int n = Math.abs(a - c), m = Math.abs(b - d);
        	
        	sb.append("Case ").append(i).append(": ").append((n == 1 && m == 2) || (n == 2 && m == 1) ? "YES" : "NO").append("\n");
        }
        System.out.print(sb);
    }
}
