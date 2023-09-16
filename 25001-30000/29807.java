import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[5];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        long answer = 0;
        
        answer += arr[0] > arr[2] ? (arr[0] - arr[2]) * 508 : (arr[2] - arr[0]) * 108;
        answer += arr[1] > arr[3] ? (arr[1] - arr[3]) * 212 : (arr[3] - arr[1]) * 305;
        
        if(n > 4) {
        	answer += arr[4] * 707;
        }
        
        System.out.print(answer * 4763);
    }
}
