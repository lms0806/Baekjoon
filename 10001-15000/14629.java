import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static long n, k, answer = 9876543210L, dif = 9876543210L;
	static boolean[] visited = new boolean[10];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		k = s.length();
		n = Long.parseLong(s);
		
		if(n >= 9876543210L) {
			System.out.println("9876543210");
		}
		else {
			dfs(0, 0);
			System.out.print(answer);
		}
	}
	
	public static void dfs(long num, int depth) {
		if(depth == k) {
			if(dif > Math.abs(n - num)) {
				answer = num;
				dif = Math.abs(n - num);
			}
			return;
		}
		
		for(int i = 0; i < 10; i++) {
			if(!visited[i]) {
				visited[i] = true;
				dfs(num * 10 + i, depth + 1);
				visited[i] = false;
			}
		}
	}
}
