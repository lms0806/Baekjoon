import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] a = {57429, 58239, 75249, 95742, 95823, 97524};
        String[] b = {"06381", "06471", "08361", "10638", "10647", "10836"};
        
        int n = Integer.parseInt(br.readLine()) - 1;
        System.out.print(a[n] + " " + b[n]);
    }
}
