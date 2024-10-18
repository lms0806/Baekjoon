import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	StringBuilder sb = new StringBuilder();
    	while(true) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
    		
    		if(a == 0 && b == 0) {
    			break;
    		}
    		
    		sb.append(a).append(" ").append(b).append(" ");
    		
    		HashMap<Integer, Integer> mapA = new HashMap<>(), mapB = new HashMap<>();
    		int idx = 1;
    		mapA.put(a, idx++);
    		while(true) {
    			int num = cal(a);
    			
    			if(mapA.containsKey(num)) {
    				break;
    			}
    			
    			mapA.put(num, idx++);
    			a = num;
    		}    		
    		
    		idx = 1;
    		mapB.put(b, idx++);
    		while(true) {
    			int num = cal(b);
    			
    			if(mapB.containsKey(num)) {
    				break;
    			}
    			
    			mapB.put(num, idx++);
    			b = num;
    		}
    		
    		int answer = Integer.MAX_VALUE;
    		for(int numA : mapA.keySet()) {
    			if(mapB.containsKey(numA)) { 
    				answer = Math.min(answer, mapA.get(numA) + mapB.get(numA));
    			}
    		}
    		sb.append(answer == Integer.MAX_VALUE ? 0 : answer).append("\n");
    	}
    	System.out.print(sb);
    }
    
    public static int cal(int num) {
    	int result = 0;
    	while(num != 0) {
    		result += Math.pow(num % 10, 2);
    		num /= 10;
    	}
    	return result;
    }
}
