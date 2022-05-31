import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
        	arr[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(arr);
        
        int sum = 0;
        for(int i = n - 1; i >= 0; i--) {
        	sum += arr[i];
        	if(b <= sum) {
        		System.out.print(n - i);
        		break;
        	}
        }
    }
}
