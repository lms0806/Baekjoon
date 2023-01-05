import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n];
        
        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        	sum += arr[i];
        }
        
        int idx = 0;
        for(int i = 0; i < n; i++) {
        	if(sum - arr[i] == arr[i]) {
        		idx = i;
        	}
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
        	if(i != idx) {
        		sb.append(arr[i]).append(" ");
        	}
        }
        sb.append(arr[idx]);
        
        System.out.print(sb);
    }
}
