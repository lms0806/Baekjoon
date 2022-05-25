import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        while(t --> 0) {
        	sb.append(solve(br.readLine())).append("\n");
        }
        System.out.print(sb);
    }
    
    public static String solve(String s) {
    	Map<Character, Integer> map = new HashMap<>();
    	map.put('m', 0);
    	map.put('p', 1);
    	map.put('s', 2);
    	
    	int[][] num = new int[10][3];
    	for(String str : s.split(" ")) {
    		num[str.charAt(0) - '0'][map.get(str.charAt(1))]++;
    	}
    	
    	int two = 0;
    	for(int i = 0; i < 3; i++) {
    		int count = 0;
    		for(int j = 1; j < 10; j++) {
    			int result = num[j][i];
    			
    			if(result == 1) {
    				count++;
    			}
    			else if(result > 2) {
    				return ":)";
    			}
    			else if(result == 2) {
    				two++;
    				if(two > 1) {
    					return ":)";
    				}
    				count++;
    			}
    			else {
    				count = 0;
    			}
    			
    			if(count == 3) {
    				return ":)";
    			}
    		}
    	}
    	return ":(";
    }
}
