import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
	static int n;
	static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        
        arr = new int[n][n];
        
        for(int i = 0; i < n; i++) {
        	String s = br.readLine();
        	for(int j = 0; j < n; j++) {
        		arr[i][j] = s.charAt(j) - '0';
        	}
        }
        
        System.out.print(dijkstra());
    }
    
    public static int dijkstra() {
    	PriorityQueue<Node> pq = new PriorityQueue<>();
    	int[][] dist = new int[n][n];
    	int[][] count = new int[n][n];
    	
    	for(int i = 0; i < n; i++) {
    		Arrays.fill(dist[i], Integer.MAX_VALUE);
    		Arrays.fill(count[i], Integer.MAX_VALUE);
    	}
    	
    	dist[0][0] = 0;
    	count[0][0] = 0;
    	pq.add(new Node(0, 0, 0, 0));
    	
    	int[] dx = {1, 0, -1, 0};
    	int[] dy = {0, 1, 0, -1};
    	
    	while(!pq.isEmpty()) {
    		Node now = pq.poll();
    		
    		for(int i = 0; i < 4; i++) {
    			int nx = now.x + dx[i];
    			int ny = now.y + dy[i];
    			
    			if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
        			int ncount = arr[nx][ny] == 0 ? now.count + 1 : now.count;
    				if(dist[nx][ny] > dist[now.x][now.y] + 1 && count[nx][ny] > ncount) {
    					dist[nx][ny] = dist[now.x][now.y] + 1;
    					count[nx][ny] = ncount;
    					pq.add(new Node(nx, ny, dist[nx][ny], count[nx][ny]));
    				}
    			}
    		}
    	}
    	
    	return count[n - 1][n - 1];
    }
}

class Node implements Comparable<Node>{
	int x, y, cost, count;
	
	public Node(int x, int y, int cost, int count) {
		this.x = x;
		this.y = y;
		this.cost = cost;
		this.count = count;
	}
	
	@Override
	public int compareTo(Node o) {
		if(this.count == o.count) {
			return this.cost = o.cost;
		}
		return this.count - o.count;
	}
}
