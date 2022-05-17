import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
        
        System.out.print((r == n && (d + 1) % 2 == n % 2) ? "YES!" : "NO...");
    }
}
