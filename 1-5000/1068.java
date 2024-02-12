import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer>[] arr;
	static boolean[] visited;
	static int answer = 0;
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		arr = new ArrayList[n];
		visited = new boolean[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = new ArrayList<>();
		}
		
		int root = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num == -1) {
				root = i;
			}
			else {
				arr[num].add(i);
			}
		}
		
		int k = Integer.parseInt(br.readLine());
		
		dfs(root, k);
		
		System.out.print(answer);
	}
	
	public static int dfs(int node, int k) {
		if(node == k) {
			return -1;
		}
		
		if(arr[node].size() == 0) {
			answer++;
		}
		
		for(int i = 0; i < arr[node].size(); i++) {
			int temp = dfs(arr[node].get(i), k);
			
			if(temp == -1 && arr[node].size() == 1) {
				answer++;
			}
		}
		return 0;
	}
}
