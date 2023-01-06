import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        while(true) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        	
        	if(a == 0 && b == 0) {
        		break;
        	}
        	
        	int[] arr = new int[a];
        	
        	for(int i = 0; i < b; i++) {
        		st = new StringTokenizer(br.readLine());
        		for(int j = 0; j < a; j++) {
        			arr[j] += Integer.parseInt(st.nextToken());
        		}
        	}
        	
        	sb.append(solve(arr, b)).append("\n");
        }
        System.out.print(sb);
    }
    
    public static String solve(int[] arr, int b) {
    	for(int ar : arr) {
    		if(ar == b) {
    			return "yes";
    		}
    	}
    	return "no";
    }
}
