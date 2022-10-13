import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static int[][] num = new int[3][3];
	static boolean[] visited;
	static ArrayList<int[]> arr = new ArrayList<>();
	static HashSet<String> set = new HashSet<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		for(int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 3; j++) {
				num[i][j] = Integer.parseInt(st.nextToken());
				if(num[i][j] == 0) {
					arr.add(new int[] {i, j});
				}
			}
		}
		
		visited = new boolean[arr.size()];
		
		dfs(0);
		
		System.out.print(set.size());
	}
	
	public static void dfs(int depth) {
		if(depth == arr.size()) {
			boolean flag = true;
			for(int i = 0; i < 3; i++) {
				if(num[i][0] == num[i][1] || num[i][1] == num[i][2] || num[i][0] == num[i][2]) {
					flag = false;
					break;
				}
				if(num[0][i] == num[1][i] || num[1][i] == num[2][i] || num[0][i] == num[2][i]) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				StringBuilder sb = new StringBuilder();
				for(int i = 0; i < 3; i++) {
					sb.append(Arrays.toString(num[i]));
				}
				set.add(sb.toString());
			}
			return;
		}
		for(int i = 0; i < arr.size(); i++) {
			if(!visited[i]) {
				visited[i] = true;
				for(int j = 1; j <= 9; j++) {
					num[arr.get(i)[0]][arr.get(i)[1]] = j;
					dfs(depth + 1);
					num[arr.get(i)[0]][arr.get(i)[1]] = 0;
				}
				visited[i] = false;
			}
		}
	}
}
