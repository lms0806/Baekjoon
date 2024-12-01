import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	int[] arr = new int[n];
    	
    	int sum = 0;
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < n; i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
    		sum += arr[i];
    	}
    	
    	sum /= n;
    	
    	int a = 0, b = 0;
    	for(int num : arr) {
    		if(num > sum + 1) {
    			a += num - sum - 1;
    		}
    		else if(num < sum) {
    			b += sum - num;
    		}
    	}
    	System.out.print(Math.max(a, b));
    }
}
