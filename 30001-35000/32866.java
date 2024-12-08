import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double n = Double.parseDouble(br.readLine()), x = Double.parseDouble(br.readLine());
        
        System.out.print((n / (n - n * (x / 100)) - 1) * 100);
    }
}
