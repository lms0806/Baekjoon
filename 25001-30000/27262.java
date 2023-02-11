import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        
        System.out.print((n + k - 2) * b + " " + (n - 1) * a);
    }
}
