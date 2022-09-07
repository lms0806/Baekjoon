import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int[] arr;
	static boolean[] visited;
	static String answer = "";
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int testcase = Integer.parseInt(st.nextToken());
			
			n = Integer.parseInt(st.nextToken());
			
			arr = new int[10];
			visited = new boolean[10];
			
			for(int i = 0; i < 10; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			answer = "NO";
			dfs(0, 0);
			
			sb.append(testcase).append(" ").append(answer).append("\n");
		}
		System.out.print(sb);
	}
	
	public static void dfs(int sum, int which) {
		if(answer.equals("YES")) {
			return;
		}
		
		if(sum == n) {
			answer = "YES";
			return;
		}
		
		for(int i = which; i < 10; i++) {
			if(!visited[i]) {
				visited[i] = true;
				dfs(sum + arr[i], i);
				visited[i] = false;
			}
		}
	}
}
