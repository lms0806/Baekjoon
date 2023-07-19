import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long answer = 1;
        while(n --> 1){
            answer *= n + 1;
        }

        System.out.print(answer / 60 / 60 / 24 / 7);
    }
}
