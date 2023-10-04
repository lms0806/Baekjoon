import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int m = Integer.parseInt(st.nextToken());

            while(m --> 0){
                arr[i] += Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(arr);

        long answer = 0, before = 0;
        for(int i = 0; i < n; i++){
            answer += arr[i] + before;

            before += arr[i];
        }
        System.out.print(answer);
    }
}
