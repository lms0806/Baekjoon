import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int[][] arr;
	public static boolean[] visited;
	public static int answer = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int point = Integer.parseInt(br.readLine()) + 1, line = Integer.parseInt(br.readLine());
		
		arr = new int[point][point];
		visited = new boolean[point];
		
		while(line --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		dfs(1);
		
		System.out.print(answer - 1);
	}
	
	public static void dfs(int start) {
		if(start == arr.length) {
			return;
		}
		
		visited[start] = true;
		answer++;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[start][i] == 1 && !visited[i]) {
				dfs(i);
			}
		}
	}
}
