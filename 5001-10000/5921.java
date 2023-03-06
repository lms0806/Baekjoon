import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int n, answer = 0;
	static int[] num;
	static boolean[] visited;
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		num = new int[n];
		visited = new boolean[n];
		
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		dfs(0, 0, 0);
		
		System.out.print(answer);
	}
	
	public static void dfs(int depth, int sum, int count) {
		answer = Math.max(answer, count);
		
		if(count + (n - depth) <= answer) {
			return;
		}
		
		if(depth == n) {
			return;
		}
		
		if(upper(sum, num[depth])) {
			dfs(depth + 1, sum + num[depth], count + 1);
		}
		dfs(depth + 1, sum, count);
	}
	
	public static boolean upper(int a, int b) {
		int size = Math.min(String.valueOf(a).length(), String.valueOf(b).length());
		
		while(size --> 0) {
			if(a % 10 + b % 10 >= 10) {
				return false;
			}
			
			a /= 10;
			b /= 10;
		}
		return true;
	}
}
