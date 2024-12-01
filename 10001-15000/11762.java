import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int[] arr = new int[6];
    	boolean[] check = new boolean[6];
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < 6; i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	Arrays.sort(arr);
    	
    	int a = Integer.parseInt(st.nextToken());
    	
    	StringBuilder sb = new StringBuilder();
    	for(int i = 0; i < arr.length; i++) {
    		for(int j = i + 1; j < arr.length; j++) {
    			for(int k = j + 1; k < arr.length; k++) {
    				if(arr[i] + arr[j] + arr[k] == a) {
    					check[i] = true;
    					check[j] = true;
    					check[k] = true;
    					sb.append(arr[k]).append(" ").append(arr[j]).append(" ").append(arr[i]).append(" ");
    					break;
    				}
    			}
    			
    			if(sb.length() != 0) {
    				break;
    			}
    		}
    		
    		if(sb.length() != 0) {
    			break;
    		}
    	}
    	for(int i = arr.length - 1; i >= 0; i--) {
    		if(!check[i]) {
    			sb.append(arr[i]).append(" ");
    		}
    	}
    	System.out.print(sb);
    }
}
