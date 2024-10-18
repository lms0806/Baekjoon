import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	static int[][] arr;
	static int n, min = Integer.MAX_VALUE;
	static int[] dx = {0, 1, 0, -1, 0};
	static int[] dy = {0, 0, 1, 0, -1};
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	n = Integer.parseInt(br.readLine());
    	
    	arr = new int[n][n];
    	
    	for(int i = 0; i < n; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		for(int j = 0; j < n; j++) {
    			arr[i][j] = Integer.parseInt(st.nextToken());
    		}
    	}
    	
    	dfs(0, 0, new boolean[n][n]);
    	
    	System.out.print(min);
    }
    
    public static void dfs(int count, int sum, boolean[][] visited) {
    	if(count == 3) {
    		min = Math.min(min, sum);
    		return;
    	}
    	
    	for(int i = 1; i < n - 1; i++) {
    		for(int j = 1; j < n - 1; j++) {
    			boolean flag = false;
    			for(int k = 0; k < 5; k++) {
    				if(visited[i + dx[k]][j + dy[k]]) {
    					flag = true;
    					break;
    				}
    			}
    			
    			if(flag) {
    				continue;
    			}
    			
    			int num = 0;
    			for(int k = 0; k < 5; k++) {
    				int nx = i + dx[k], ny = j + dy[k];
    				
    				visited[nx][ny] = true;
    				num += arr[nx][ny];
    			}
    			
    			dfs(count + 1, sum + num, visited);
    			
    			for(int k = 0; k < 5; k++) {
    				visited[i + dx[k]][j + dy[k]] = false;
    			}
    		}
    	}
    }
}
