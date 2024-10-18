import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
    	
    	long[] arr = new long[n];
    	for(int i = 0; i < n; i++) {
    		arr[i] = Long.parseLong(br.readLine());
    	}
    	
    	Arrays.sort(arr);
    	
    	long left = arr[0], right = arr[n - 1] + k;
    	while(left <= right) {
    		long mid = (left + right) >> 1;
    		
    		long num = 0;
    		for(long a : arr) {
    			if(a >= mid) {
    				break;
    			}
    			num += mid - a;
    		}
    		
    		if(num <= k) {
    			left = mid + 1;
    		}
    		else {
    			right = mid - 1;
    		}
    	}
    	System.out.print(right);
    }
}
