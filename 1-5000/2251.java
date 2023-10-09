import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        bfs(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
    }
    
    public static void bfs(int ma, int mb, int mc) {
    	Queue<Node> queue = new LinkedList<>();
    	boolean[][][] visited = new boolean[ma + 1][mb + 1][mc + 1];
    	queue.add(new Node(0, 0, mc));
    	
    	TreeSet<Integer> set = new TreeSet<>();
    	
    	while(!queue.isEmpty()) {
    		Node now = queue.poll();
    		int a = now.a, b = now.b, c = now.c;
    		
    		if(visited[a][b][c]) {
    			continue;
    		}
    		
    		visited[a][b][c] = true;
    		
    		if(a == 0) {
    			set.add(c);
    		}
    		
    		if(a <= mb - b) {
    			queue.add(new Node(0, a + b, c));
    		}
    		else {
    			queue.add(new Node(a - mb + b, mb, c));
    		}
    		
    		if(a <= mc - c) {
    			queue.add(new Node(0, b, a + c));
    		}
    		else {
    			queue.add(new Node(a - mc + c, b, mc));
    		}
    		
    		if(b <= ma - a) {
    			queue.add(new Node(a + b, 0, c));
    		}
    		else {
    			queue.add(new Node(ma, b - ma + a, c));
    		}
    		
    		if(b <= mc - c) {
    			queue.add(new Node(a, 0, b + c));
    		}
    		else {
    			queue.add(new Node(a, b - mc + c, mc));
    		}
    		
    		if(c <= ma - a) {
    			queue.add(new Node(a + c, b, 0));
    		}
    		else {
    			queue.add(new Node(ma, b, c - ma + a));
    		}
    		
    		if(c <= mb - b) {
    			queue.add(new Node(a, b + c, 0));
    		}
    		else {
    			queue.add(new Node(a, mb, c - mb + b));
    		}
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	for(Integer s : set) {
    		sb.append(s).append(" ");
    	}
    	System.out.print(sb);
    }
}

class Node{
	int a, b, c;
	
	public Node(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
}
