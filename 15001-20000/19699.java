import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	static int n, m, max = 0;
	static int[] arr;
	static boolean[] visited;
	static TreeSet<Integer> set = new TreeSet<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		visited = new boolean[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0, 0);
		
		boolean[] prime = check_sosu(max);
		
		Iterator<Integer> iter = set.iterator();
		
		StringBuilder sb = new StringBuilder();
		while(iter.hasNext()) {
			int number = iter.next();
			if(!prime[number]) {
				sb.append(number).append(" ");
			}
		}
		System.out.print(sb.length() == 0 ? -1 : sb);
	}
	
	public static boolean[] check_sosu(int max) {
		boolean[] prime = new boolean[max + 1];
		
		for(int i = 2; i * i <= max; i++) {
			if(!prime[i]) {
				for(int j = i * i; j <= max; j += i) {
					prime[j] = true;
				}
			}
		}
		
		return prime;
	}
	
	public static void dfs(int depth, int sum) {
		if(depth == m) {
			max = Math.max(max, sum);
			set.add(sum);
			return;
		}
		
		for(int i = 0; i < n; i++) {
			if(!visited[i]) {
				visited[i] = true;
				dfs(depth + 1, sum + arr[i]);
				visited[i] = false;
			}
		}
	}
}
