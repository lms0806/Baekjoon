import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(t --> 0){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

            int[][] arr = new int[n][m];
            for(int i = 0; i < n; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < m; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    int a = 0, b = 0, c = 0;

                    if(j > 0){
                        a = arr[i][j - 1];
                    }
                    if(i > 0){
                        b = arr[i - 1][j];
                    }
                    if(i > 0 && j > 0){
                        c = arr[i - 1][j - 1];
                    }

                    sb.append(solve(a, b, c, arr[i][j])).append(" ");
                }
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }

    public static String solve(int a, int b, int c, int num){
        int answer = 0;
        int min = num;

        if(abs(min) > abs(num - a)){
            answer = 1;
            min = num - a;
        }
        if(abs(min) > abs(num - b)){
            answer = 2;
            min = num - b;
        }
        if(abs(min) > abs(num - ((a + b) >> 1))){
            answer = 3;
            min = num - ((a + b) >> 1);
        }
        if(abs(min) > abs(num - (a + b - c))){
            answer = 4;
            min = num - (a + b - c);
        }

        return answer + " " + min;
    }

    public static int abs(int n){
        return Math.abs(n);
    }
}
