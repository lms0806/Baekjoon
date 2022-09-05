import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int n;
	static char[] board;
	static boolean[] visited;
	static ArrayList<String> arr = new ArrayList<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		n = Integer.parseInt(br.readLine());
		
		board = new char[n + 1];
		visited = new boolean[10];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			board[i] = st.nextToken().charAt(0);
		}
		
		dfs(new StringBuilder(), 0, 0);
		
		Collections.sort(arr);
		
		System.out.print(arr.get(arr.size() - 1) + "\n" + arr.get(0));
	}
	
	public static void dfs(StringBuilder sb, int depth, int which) {
		if(depth - 1 == n) {
			arr.add(sb.toString());
			return;
		}
		
		if(board[depth] == '<' || depth == 0) {
			for(int i = which; i < 10; i++) {
				if(!visited[i]) {
					visited[i] = true;
					sb.append(i);
					dfs(sb, depth + 1, i);
					sb.setLength(sb.length() - 1);
					visited[i] = false;
				}
			}
		}
		else {
			for(int i = which - 1; i >= 0; i--) {
				if(!visited[i]) {
					visited[i] = true;
					sb.append(i);
					dfs(sb, depth + 1, i);
					sb.setLength(sb.length() - 1);
					visited[i] = false;
				}
			}
		}
	}
}
