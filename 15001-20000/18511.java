import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, answer;
	static int[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		arr = new int[k];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0);
		
		System.out.print(answer);
	}
	
	public static void dfs(int num) {
		answer = Math.max(answer, num);
		for(int i = 0; i < arr.length; i++) {
			if(num * 10 + arr[i] <= n) {
				dfs(num * 10 + arr[i]);
			}
		}
	}
}
