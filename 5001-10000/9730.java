import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for(int t = 1; t <= test; t++) {
        	int n = Integer.parseInt(br.readLine());
        	
        	int[] arr = new int[n];
        	
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for(int i = 0; i < n; i++) {
        		arr[i] = Integer.parseInt(st.nextToken());
        	}
        	
        	int answer = 0;
        	for(int i = 1; i < n; i++) {
        		answer += Math.max(arr[i], arr[i - 1]);
        	}
        	sb.append(String.format("Case #%d: %d", t, answer)).append("\n");
        }
        System.out.print(sb);
    }
}
