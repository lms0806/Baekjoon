import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static String[] str;
	static int[] arr, alpha;
	static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        alpha = new int[26];
        for(char c : br.readLine().toCharArray()) {
        	alpha[c - 'A']++;
        }
        
        int n = Integer.parseInt(br.readLine());
        
        arr = new int[n];
        str = new String[n];
        for(int i = 0; i < n; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	arr[i] = Integer.parseInt(st.nextToken());
        	str[i] = st.nextToken();
        }
        
        dfs(0, 0);
        
        System.out.print(answer == Integer.MAX_VALUE ? -1 : answer);
    }
    
    public static void dfs(int depth, int sum) {
    	if(depth == arr.length) {
    		boolean flag = true;
    		for(int a : alpha) {
    			if(a > 0) {
    				flag = false;
    				break;
    			}
    		}
    		
    		if(flag) {
    			answer = Math.min(answer, sum);
    		}
			return;
    	}
    	for(char c : str[depth].toCharArray()) {
    		alpha[c - 'A']--;
    	}
    	
    	dfs(depth + 1, sum + arr[depth]);
    	
    	for(char c : str[depth].toCharArray()) {
    		alpha[c - 'A']++;
    	}
    	
    	dfs(depth + 1, sum);
    }
}
