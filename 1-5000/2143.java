import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        
        int n = Integer.parseInt(br.readLine());
        
        int[] arrA = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
        	arrA[i] = Integer.parseInt(st.nextToken());
        }
        
        int m = Integer.parseInt(br.readLine());
        
        int[] arrB = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
        	arrB[i] = Integer.parseInt(st.nextToken());
        }
        
        HashMap<Integer, Long> a = getMap(arrA), b = getMap(arrB);
        
        long answer = 0;
        for(int key : a.keySet()) {
        	if(b.containsKey(t - key)) {
        		answer += a.get(key) * b.get(t - key);
        	}
        }
        System.out.print(answer);
    }
    
    public static HashMap<Integer, Long> getMap(int[] arr){
    	HashMap<Integer, Long> map = new HashMap<>();
    	for(int i = 0; i < arr.length; i++) {
    		int sum = 0;
    		for(int j = i; j < arr.length; j++) {
    			sum += arr[j];
    			
    			map.put(sum, map.getOrDefault(sum, 0L) + 1);
    		}
    	}
    	return map;
    }
}
