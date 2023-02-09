import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
	static char[][] board;
	static boolean[][] visited;
	static StringBuilder sb;
	static HashSet<String> word = new HashSet<>(), set;
	static int[] dx = {1, 0, -1, 0, 1, 1, -1, -1};
	static int[] dy = {0, 1, 0, -1, 1, -1, 1, -1};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		while(n --> 0) {
			word.add(br.readLine());
		}
		
		br.readLine();
		
		int t = Integer.parseInt(br.readLine());
		
		int[] score = {0, 0, 1, 1, 2, 3, 5, 11};
		StringBuilder answer = new StringBuilder();
		while(t --> 0) {
			System.gc();
			board = new char[4][4];
			visited = new boolean[4][4];
			
			set = new HashSet<>();
			
			for(int i = 0; i < 4; i++) {
				board[i] = br.readLine().toCharArray();
			}
			
			for(int i = 0; i < 4; i++) {
				for(int j = 0; j < 4; j++) {
					visited[i][j] = true;
					sb = new StringBuilder();
					dfs(i, j, sb.append(board[i][j]));
					visited[i][j] = false;
				}
			}
			
			int num = 0, max = 0;
			for(String s : set) {
				num += score[s.length() - 1];
				max = Math.max(max, s.length());
			}
			
			ArrayList<String> arr = new ArrayList<>();
			for(String s : set) {				
				if(s.length() == max) {
					arr.add(s);
				}
			}
			
			Collections.sort(arr);
			
			answer.append(num).append(" ").append(arr.get(0)).append(" ").append(set.size()).append("\n");
			
			if(t != 0) {
				br.readLine();
			}
		}
		System.out.print(answer);
	}
	
	public static void dfs(int x, int y, StringBuilder sb) {
		if(word.contains(sb.toString())) {
			set.add(sb.toString());
		}
		
		if(sb.length() > 8) {
			return;
		}
		
		for(int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && nx < 4 && ny >= 0 && ny < 4) {
				if(!visited[nx][ny]) {
					visited[nx][ny] = true;
					sb.append(board[nx][ny]);
					dfs(nx, ny, sb);
					sb.setLength(sb.length() - 1);
					visited[nx][ny] = false;
				}
			}
		}
	}
}
