import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n], road = new int[n][n];

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j = 0; j < n; j++){
                road[i][j] = arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.print(solve(n, arr, road));
    }

    public static int solve(int n, int[][] arr, int[][] road){
        for(int k = 0; k < n; k++){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(i == k || j == k){
                        continue;
                    }

                    if(arr[i][j] > arr[i][k] + arr[k][j]){
                        return -1;
                    }
                    if(arr[i][j] == arr[i][k] + arr[k][j]){
                        road[i][j] = 0;
                    }
                }
            }
        }

        int answer = 0;
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                answer += road[i][j];
            }
        }
        return answer / 2;
    }
}
