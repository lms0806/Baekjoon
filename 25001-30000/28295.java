import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;
        for(int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());

            answer += n == 1 ? 1 : n == 2 ? 2 : 3;

            if(answer > 3){
                answer -= 4;
            }
        }
        System.out.print(answer == 0 ? 'N' : answer == 1 ? 'E' : answer == 2 ? 'S' : 'W');
    }
}
