import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[2][n];

        for(int i = 0; i < 2; i++){
            StringTokenizer st =  new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[0][i] < arr[1][j]){
                    count++;
                }
                else if(arr[0][i] > arr[1][j]){
                    count--;
                }
            }
        }

        System.out.print(count < 0 ? "first" : count == 0 ? "tie" : "second");
    }
}
