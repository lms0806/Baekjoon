import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long k = Long.parseLong(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken()), d = Long.parseLong(st.nextToken());
        
        System.out.print(a * k + b == c * k + d ? "Yes " + (a * k + b) : "No");
    }
}
