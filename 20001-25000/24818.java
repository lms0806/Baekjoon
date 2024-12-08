import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        long sum = 0;
        long[] arr = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
        	arr[i] = Long.parseLong(st.nextToken());
        	sum += arr[i];
        }
        
        System.out.print(solve(n, arr, sum));
    }
    
    public static String solve(int n, long[] arr, long sum) {
    	if(sum % 3 != 0) {
    		return "-1";
    	}
    	
    	sum /= 3;
    	long total = 0;
    	ArrayList<Integer> list = new ArrayList<>();
    	for(int i = 0; i < n; i++) {
    		total += arr[i];
    		
    		if(total == sum) {
    			list.add(i + 1);
    			total = 0;
    		}
    	}
    	
    	return list.size() == 3 ? list.get(0) + " " + list.get(1) : "-1";
    }
}
