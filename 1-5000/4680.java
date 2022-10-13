import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static int n, total;
	static int[] num, arr;
	static boolean[] visited;
	static HashSet<String> set;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			total = Integer.parseInt(st.nextToken());
			
			if(total == 0) {
				break;
			}
			
			n = Integer.parseInt(st.nextToken());
			num = new int[n];
			visited = new boolean[n];
			
			for(int i = 0; i < n; i++) {
				num[i] = Integer.parseInt(st.nextToken());
			}
			
			set = new HashSet<>();
			arr = new int[n];
			
			sb.append("Sums of ").append(total).append(":\n");
			dfs(0, 0, Integer.MAX_VALUE);
			
			if(set.size() == 0) {
				sb.append("NONE").append("\n");
			}
		}
		System.out.print(sb);
	}
	
	public static void dfs(int depth, int sum, int before) {
		if(sum == total) {
			StringBuilder sbs = new StringBuilder();
			for(int i = 0; i < n; i++) {
				if(arr[i] == 0) {
					break;
				}
				sbs.append(arr[i]).append("+");
			}
			sbs.setLength(sbs.length() - 1);
			
			if(!set.contains(sbs.toString())) {
				set.add(sbs.toString());
				sb.append(sbs).append("\n");
			}
			
			return;
		}
		
		for(int i = depth; i < n; i++) {
			if(!visited[i] && num[i] + sum <= total && before >= num[i]) {
				visited[i] = true;
				arr[depth] = num[i];
				dfs(depth + 1, sum + num[i], num[i]);
				arr[depth] = 0;
				visited[i] = false;
			}
		}
	}
}
