import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        for(int i = 0; i < 5; i++){
            arr[Integer.parseInt(br.readLine())]++;
        }

        int answer = 0;
        for(int i = 0; i < 10; i++){
            if(arr[i] % 2 == 1){
                answer = i;
                break;
            }
        }
        System.out.print(answer);
    }
}
