import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static boolean[] fans;
	static ArrayList<Integer>[] arr;
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        
        arr = new ArrayList[n];
        for(int i = 0; i < n; i++) {
        	arr[i] = new ArrayList<>();
        }
        
        while(m --> 0) {
        	st = new StringTokenizer(br.readLine());
        	arr[Integer.parseInt(st.nextToken()) - 1].add(Integer.parseInt(st.nextToken()) - 1);
        }
        
        fans = new boolean[n];
        
        int s = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while(s --> 0) {
        	fans[Integer.parseInt(st.nextToken()) - 1] = true;
        }
        
        System.out.print(!fans[0] && dfs(0) ? "yes" : "Yes");
    }
    
    public static boolean dfs(int now) {
    	if(arr[now].size() == 0) {
    		return true;
    	}
    	
    	for(int next : arr[now]) {
    		if(!fans[next] && dfs(next)) {
    			return true;
    		}
    	}
    	return false;
    }
}
