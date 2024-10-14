import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
        
        t--;
        t %= (n << 2) - 2;
        t++;
        
        System.out.print(t <= (n << 1) ? t : ((n << 2) - t));
    }
}
