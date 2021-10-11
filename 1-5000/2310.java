import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer>[] arr;
	static char[] type;
	static boolean flag, visited[];
	static int n, money[];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			flag = false;
			visited = new boolean[n + 1];
			type = new char[n + 1];
			money = new int[n + 1];
			arr = new ArrayList[n + 1];
			for(int i = 1; i <= n; i++) {
				arr[i] = new ArrayList<>();
			}
			
			for(int i = 1; i <= n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				type[i] = st.nextToken().charAt(0);
				money[i] = Integer.parseInt(st.nextToken());
				while(st.hasMoreTokens()) {
					int num = Integer.parseInt(st.nextToken());
					if(num == 0) {
						break;
					}
					arr[i].add(num);
				}
			}
			
			if(type[1] != 'T') {
				visited[1] = true;
				dfs(money[1], 1);
			}
			
			sb.append(flag ? "Yes" : "No").append("\n");
		}
		System.out.print(sb);
	}
	
	public static void dfs(int myMoney, int node) {
		if(node == n) {
			flag = true;
			return;
		}
		
		for(int a : arr[node]) {
			if(visited[a]) {
				continue;
			}
			
			if(type[a] == 'L') {
				visited[a] = true;
				dfs(myMoney > money[a] ? myMoney : money[a], a);
			}
			else if(type[a] == 'T'){
				if(myMoney >= money[a]) {
					visited[a] = true;
					dfs(myMoney - money[a], a);
				}
				else {
					return;
				}
			}
			else {
				visited[a] = true;
				dfs(myMoney, a);
			}
		}
	}
}
