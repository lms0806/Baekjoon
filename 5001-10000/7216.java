import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()) - 1;

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken()) - 1;
        }

        int idx = k, answer = k;
        boolean[] flag = new boolean[n];
        while(true){
            if(flag[idx]){
                break;
            }
            answer = idx;

            flag[idx] = true;
            idx = arr[idx];
        }
        System.out.print(answer + 1);
    }
}
