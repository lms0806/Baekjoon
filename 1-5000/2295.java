import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
        	arr[i] = Integer.parseInt(br.readLine());
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
        	for(int j = i; j < n; j++) {
        		list.add(arr[i] + arr[j]);
        	}
        }
        
        Arrays.sort(arr);
        Collections.sort(list);
        
        int answer = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
        	for(int j = i; j >= 0; j--) {
        		if(Collections.binarySearch(list, arr[i] - arr[j]) > -1) {
            		answer = arr[i];
            		break;
            	}
        	}
        	
        	if(answer != 0) {
        		break;
        	}
        }
        System.out.print(answer);
    }
}
