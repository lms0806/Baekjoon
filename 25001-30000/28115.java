import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] a = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

        System.out.print(solve(a));
    }

    public static String solve(int[] a){
        for(int i = 0; i < a.length; i++){
            if(i > 1){
                if(a[i] - a[i - 1] != a[i - 1] - a[i - 2]){
                    return "NO";
                }
            }
        }

        return "YES\n" + print(a) + "\n" + print(new int[a.length]);
    }

    public static StringBuilder print(int[] nums){
        StringBuilder sb = new StringBuilder();
        for(int num : nums){
            sb.append(num).append(" ");
        }
        return sb;
    }
}
