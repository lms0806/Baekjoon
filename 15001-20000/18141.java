import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        double[] arr = new double[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
        	arr[i] = Double.parseDouble(st.nextToken());
        }
        
        System.out.print(solve(n, arr) ? "yes" : "no");
    }
    
    public static boolean solve(int n, double[] arr) {
    	for(int i = 0; i < n; i++) {
        	for(int j = 0; j < n; j++) {
        		if(i == j) {
        			continue;
        		}
        		
        		for(int k = 0; k < n; k++) {
        			if(i == k || j == k) {
        				continue;
        			}
        			
        			double num = (arr[i] - arr[j]) / arr[k];
        			
        			if(num != (int)num) {
        				return false;
        			}
        		}
        	}
        }
    	return true;
    }
}
