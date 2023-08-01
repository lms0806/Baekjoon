import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long[] arr = new long[n], mularr = new long[n];
        long[] dp = new long[n];

        for(int i = 0; i < n; i++){
            dp[i] = arr[i] = Long.parseLong(br.readLine());
            mularr[i] = arr[i] * arr[i];

            if(i > 0){
                dp[i] += dp[i - 1];
                mularr[i] += mularr[i - 1];
            }
        }

        long answer = 0;
        for(int i = 0; i < n; i++){
            answer = Math.max(answer, mularr[i] * (dp[n - 1] - dp[i]));
        }

        System.out.println(answer);
    }
}
