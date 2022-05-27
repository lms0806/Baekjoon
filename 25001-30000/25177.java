import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

        int[] a = new int[Math.max(n, m)];
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
        	a[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        int answer = 0;
        for(int i = 0; i < m; i++) {
        	answer = Math.max(answer, Integer.parseInt(st.nextToken()) - a[i]);
        }
        System.out.print(answer);
    }
}
