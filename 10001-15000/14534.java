import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	static ArrayList<Character> arr;
	static boolean[] visited;
	static StringBuilder answer = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= t; i++) {
			answer.append("Case # ").append(i).append(": ").append("\n");
			
			arr = new ArrayList<>();
			for(char c : br.readLine().toCharArray()) {
				arr.add(c);
			}
			
			visited = new boolean[arr.size()];
			
			dfs(new StringBuilder(), 0);
		}
		System.out.print(answer);
	}
	
	public static void dfs(StringBuilder sb, int depth) {
		if(depth == arr.size()) {
			answer.append(sb.toString()).append("\n");
			return;
		}
		
		for(int i = 0; i < arr.size(); i++) {
			if(!visited[i]) {
				visited[i] = true;
				sb.append(arr.get(i));
				dfs(sb, depth + 1);
				sb.setLength(sb.length() - 1);
				visited[i] = false;
			}
		}
	}
}
