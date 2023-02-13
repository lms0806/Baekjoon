import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int t = 1;
    	StringBuilder sb = new StringBuilder();
    	while(true) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		
    		int n = Integer.parseInt(st.nextToken());
    		
    		if(n == 0) {
    			break;
    		}
    		
    		double[] arr = new double[n];
    		
    		for(int i = 0; i < n; i++) {
    			arr[i] = Double.parseDouble(st.nextToken());
    		}
    		
    		sb.append("Case ").append(t++).append(": ").append(n % 2 == 0 ? (arr[n / 2] + arr[n / 2 - 1]) / 2 : arr[n / 2]).append("\n");
    	}
    	System.out.print(sb);
    }
}
