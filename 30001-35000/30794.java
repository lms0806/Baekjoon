import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        String s = st.nextToken();

        System.out.print(n * (s.equals("miss") ? 0 : s.equals("bad") ? 200 : s.equals("cool") ? 400 : s.equals("great") ? 600 : 1000));
    }
}
