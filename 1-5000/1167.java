import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static boolean[] visited;
	static ArrayList<Node>[] arr;
	static int end = 0, answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        arr = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        
        for(int i = 1; i <= n; i++) {
        	arr[i] = new ArrayList<>();
        }
        
        for(int i = 1; i <= n; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int idx = Integer.parseInt(st.nextToken());
        	
        	while(true) {
        		int end = Integer.parseInt(st.nextToken());
        		
        		if(end == -1) {
        			break;
        		}
        		
        		int cost = Integer.parseInt(st.nextToken());
        		
        		arr[idx].add(new Node(end, cost));
        	}
        }
        
        dfs(1, 0);
        
        Arrays.fill(visited, false);
        
        dfs(end, 0);
        
        System.out.print(answer);
    }
    
    public static void dfs(int num, int sum) {
    	if(visited[num]) {
    		return;
    	}
    	
    	visited[num] = true;
    	if(answer < sum) {
    		answer = sum;
    		end = num;
    	}
    	
    	for(int i = 0; i < arr[num].size(); i++) {
    		Node node = arr[num].get(i);
    		dfs(node.end, sum + node.cost);
    	}
    }
}

class Node{
	int end, cost;
	
	public Node(int end, int cost) {
		this.end = end;
		this.cost = cost;
	}
}
