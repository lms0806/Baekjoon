import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int x, y;
	static int answer = -1, count = 0;
	static boolean[] visited;
	static int[][] num;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		num = new int[n][n];
		visited = new boolean[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		x = Integer.parseInt(st.nextToken()) - 1;
		y = Integer.parseInt(st.nextToken()) - 1;
		
		int size = Integer.parseInt(br.readLine());
		for(int i = 0; i < size; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1, b = Integer.parseInt(st.nextToken()) - 1;
			
			num[a][b] = num[b][a] = 1;
		}
		
		dfs(x, 0);
		
		System.out.print(answer);
	}
	
	public static void dfs(int index, int count) {
		if(index == y) {
			answer = count;
			return;
		}
		
		for(int i = 0; i < visited.length; i++) {
			if(!visited[i] && num[index][i] == 1) {
				visited[index] = true;
				dfs(i, count + 1);
				visited[index] = false;
			}
		}
	}
}
