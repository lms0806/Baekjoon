import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static int answer = 0;
	static int[] arr = new int[10];
	static boolean[][] visited = new boolean[10][5];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 10; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0, 0, -1, -1);
		
		System.out.print(answer);
		
	}
	
	public static void dfs(int depth, int score, int before, int before1) {
		if(depth == 10) {
			if(score >= 5) {
				answer++;
			}
			return;
		}
		
		for(int i = 0; i < 5; i++) {
			if(before == before1 && before == i + 1) {
				continue;
			}
			if(!visited[depth][i]) {
				visited[depth][i] = true;
				dfs(depth + 1, arr[depth] == i + 1 ? score + 1 : score, before1, i + 1);
				visited[depth][i] = false;
			}
		}
	}
}
