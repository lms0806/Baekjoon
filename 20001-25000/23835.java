import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer>[] arr;
	static int[] num;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		arr = new ArrayList[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<>();
		}
		num = new int[n + 1];
		
		for(int i = 1; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			arr[a].add(b);
			arr[b].add(a);
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int check = Integer.parseInt(st.nextToken());
			
			if(check == 1) {
				dfs(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), -1, 0);
			}
			else {
				sb.append(num[Integer.parseInt(st.nextToken())]).append("\n");
			}
		}
		System.out.print(sb);
	}
	
	public static boolean dfs(int now, int dest, int last, int step) {
		if(now == dest) {
			num[now] += step;
			return true;
		}
		
		for(int next : arr[now]) {
			if(next != last) {
				if(dfs(next, dest, now, step + 1)) {
					num[now] += step;
					return true;
				}
			}
		}
		return false;
	}
}
