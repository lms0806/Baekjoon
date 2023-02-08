import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	static int n, which = 1;
	static int[] path, dfs_path;
	static boolean[] visited;
	static ArrayList<Integer>[] arr;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		n = Integer.parseInt(br.readLine());
		
		path = new int[n + 1];
		dfs_path = new int[n + 1];
		int[] order = new int[n + 1];
		visited = new boolean[n + 1];
		arr = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for(int i = 1; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			arr[a].add(b);
			arr[b].add(a);
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			path[i] = num;
			order[num] = i;
		}
		
		for(int i = 1; i <= n; i++) {
			Collections.sort(arr[i], new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					return order[o1] - order[o2];
				}
			});
		}
		
		dfs(1);
		
		System.out.print(print());
	}
	
	public static int print() {
		for(int i = 1; i <= n; i++) {
			if(path[i] != dfs_path[i]) {
				return 0;
			}
		}
		return 1;
	}
	
	public static void dfs(int x) {
		visited[x] = true;
		
		dfs_path[which++] = x;
		for(int a : arr[x]) {
			if(!visited[a]) {
				dfs(a);
			}
		}
	}
}
