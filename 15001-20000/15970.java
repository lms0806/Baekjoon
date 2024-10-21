import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	int n = Integer.parseInt(br.readLine());
    	
    	ArrayList<Integer>[] arr = new ArrayList[n + 1];
    	
    	for(int i = 1; i <= n; i++) {
    		arr[i] = new ArrayList<>();
    	}
    	
    	for(int i = 0; i < n; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		
    		int x = Integer.parseInt(st.nextToken()), color = Integer.parseInt(st.nextToken());
    		arr[color].add(x);
    	}
    	
    	for(int i = 1; i <= n; i++) {
    		Collections.sort(arr[i]);
    	}
    	
    	int answer = 0;
    	for(int i = 1; i <= n; i++) {
    		for(int j = 0; j < arr[i].size(); j++) {
    			if(j == 0) {
    				answer += arr[i].get(j + 1) - arr[i].get(j);
    			}
    			else if(j == arr[i].size() - 1) {
    				answer += arr[i].get(j) - arr[i].get(j - 1);
    			}
    			else {
    				answer += Math.min(arr[i].get(j) - arr[i].get(j - 1), arr[i].get(j + 1) - arr[i].get(j));
    			}
    		}
    	}
    	System.out.print(answer);
    }
}
