import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[1001];

        StringTokenizer st = new StringTokenizer(br.readLine());
        while(n --> 0) {
            arr[Integer.parseInt(st.nextToken())]++;
        }

        int answer = 0;
        for(int a : arr){
            answer += Math.min(a, 2);
        }
        System.out.print(answer);
    }
}
