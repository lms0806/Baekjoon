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
        
        arr = new ArrayList[n];
        visited = new boolean[n];
        
        for(int i = 0; i < n; i++) {
        	arr[i] = new ArrayList<>();
        }
        
        for(int i = 1; i < n; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken()) - 1;
        	int cost = Integer.parseInt(st.nextToken());
        	
        	arr[a].add(new Node(b, cost));
        	arr[b].add(new Node(a, cost));
        }
        
        dfs(0, 0);
        
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
    		dfs(arr[num].get(i).end, sum + arr[num].get(i).cost);
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
