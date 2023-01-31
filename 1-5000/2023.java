import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int n;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		n = Integer.parseInt(br.readLine());
		
		dfs(0, 0);
		
		System.out.print(sb);
	}
	
	public static void dfs(int depth, int num) {
		if(!isprime(num)) {
			return;
		}
		if(depth == n) {
			if(isprime(num)) {
				sb.append(num).append("\n");
			}
			return;
		}
		
		for(int i = 1; i < 10; i++) {
			dfs(depth + 1, num * 10 + i);
		}
	}
	
	public static boolean isprime(int num) {
		if(num == 1) {
			return false;
		}
		for(int i = 2; i * i <= num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
