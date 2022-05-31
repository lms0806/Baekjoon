import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer>[] arr;
	static boolean[] visited;
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        int count = 1;
        while(true) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        	
        	if(n == 0 && m == 0) {
        		break;
        	}
        	
        	visited = new boolean[n];
        	arr = new ArrayList[n];
        	for(int i = 0; i < n; i++) {
        		arr[i] = new ArrayList<>();
        	}
        	
        	while(m --> 0) {
        		st = new StringTokenizer(br.readLine());
        		int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken()) - 1;
        		
        		arr[a].add(b);
        		arr[b].add(a);
        	}
        	
        	int answer = 0;
        	for(int i = 0; i < arr.length; i++) {
        		if(arr[i].size() != 0 && !visited[i]) {
        			dfs(i);
        			answer++;
        		}
        	}
        	
        	for(int i = 0; i < visited.length; i++) {
        		if(!visited[i]) {
        			answer++;
        		}
        	}
        	
        	sb.append("Case ").append(count).append(": ").append(answer).append("\n");
        	count++;
        }
        System.out.print(sb);
    }
    
    public static void dfs(int depth) {
    	for(int a : arr[depth]) {
    		if(!visited[a]) {
    			visited[a] = true;
    			dfs(a);
    		}
    	}
    	return;
    }
}
