import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static ArrayList<Integer>[] arr;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		arr = new ArrayList[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < s.length(); j++) {
				if(s.charAt(j) == 'Y') {
					arr[i].add(j);
					arr[j].add(i);
				}
			}
		}
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			visited = new boolean[n];
			dfs(i, 0);
			
			int count = -1;
			for(int j = 0; j < n; j++) {
				if(visited[j]) {
					count++;
				}
			}
			answer = Math.max(answer, count);
		}
		System.out.print(answer);
	}
	
	public static void dfs(int depth, int count) {
		if(count == 3) {
			return;
		}
		
		visited[depth] = true;
		
		for(int a : arr[depth]) {
			dfs(a, count + 1);
		}
	}
}
