import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()) + 1, m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[n], sum = new int[n];
        
        arr[0] = x;
        sum[0] = x < k ? 1 : 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i < n; i++) {
        	arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        	sum[i] = sum[i - 1] + (arr[i] < k ? 1 : 0);
        }
        
        StringBuilder sb = new StringBuilder();
        while(m --> 0) {
        	st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken()) - 1;
        	
        	sb.append(sum[b] - sum[a]).append("\n");
        }
        System.out.print(sb);
    }
}
