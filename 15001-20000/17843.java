import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        while(t --> 0) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int h = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken());
        	
        	double[] arr = {3600 * h + 60 * m + s, 720 * m + 12 * s, 720 * s};
        	
        	Arrays.sort(arr);
        	
        	sb.append((double)(Math.min(Math.min(arr[1] - arr[0], arr[2] - arr[1]), 43200 + arr[0] - arr[2]) / 120)).append("\n");
        }
        System.out.print(sb);
    }
}
