import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine());

        int answer = 0;
        for(int i = 1; i <= a; i++){
            for(int j = 1; j <= b; j++){
                if(i + j == 10){
                    answer++;
                }
            }
        }

        System.out.print("There " + (answer == 1 ? "is" : "are") + " " + answer + (answer == 1 ? " way" : " ways") + " to get the sum 10.");
    }
}
