import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Node> home, chicken;
	static int answer = Integer.MAX_VALUE, m;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		home = new ArrayList<>();
		chicken = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				int num = Integer.parseInt(st.nextToken());
				
				if(num == 1) {
					home.add(new Node(i, j));
				}
				else if(num == 2) {
					chicken.add(new Node(i, j, false));
				}
			}
		}
		
		dfs(0, 0);
		
		System.out.print(answer);
	}
	
	public static void dfs(int idx, int count) {
		if(count == m) {
			int sum = 0;
			for(Node h : home) {
				int min = Integer.MAX_VALUE;
				for(int i = 0; i < chicken.size(); i++) {
					if(chicken.get(i).visited) {
						min = Math.min(min, Math.abs(h.x - chicken.get(i).x) + Math.abs(h.y - chicken.get(i).y));
					}
				}
				sum += min;
			}
			
			answer = Math.min(answer, sum);
		}
		
		for(int i = idx; i < chicken.size(); i++) {
			if(!chicken.get(i).visited) {
				chicken.get(i).visited = true;
				dfs(i + 1, count + 1);
				chicken.get(i).visited = false;
			}
		}
	}
}

class Node {
	int x, y;
	boolean visited;
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Node(int x, int y, boolean visited) {
		this.x = x;
		this.y = y;
		this.visited = visited;
	}
}
