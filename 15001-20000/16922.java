import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int n, answer = 0;
	static int[] number = {1, 5, 10, 50};
	static boolean[] visited = new boolean[1001];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		dfs(0, 0, 0);
		
		System.out.print(answer);
	}
	
	public static void dfs(int num, int depth, int which) {
		if(depth == n) {
			if(!visited[num]) {
				visited[num] = true;
				answer++;
			}
			return;
		}
		for(int i = which; i < 4; i++) {
			dfs(num + number[i], depth + 1, i);
		}
	}
}
