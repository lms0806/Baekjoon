import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()) * 2;
        
        int[] arr = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        int answer = Integer.MAX_VALUE;
        for(int i = 0; i < n / 2; i++) {
        	answer = Math.min(answer, arr[i] + arr[n - i - 1]);
        }
        System.out.print(answer);
    }
}
