import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] time = new int[2][2];

        for(int i = 0; i < 2; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }

        int n = Integer.parseInt(br.readLine());

        int answer = 0;
        while(time[0][0] != time[1][0] || time[0][1] != time[1][1]){
            answer += check(time[0], n);

            if(++time[0][1] == 60){
                time[0][0]++;
                time[0][1] = 0;
            }
        }
        System.out.print(answer + check(time[0], n));
    }

    public static int check(int[] arr, int n){
        for(int a : arr){
            if(a % 10 == n || a / 10 == n){
                return 1;
            }
        }
        return 0;
    }
}
