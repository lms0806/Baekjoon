import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	static int answer = -1;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		if(n == 1) {
			System.out.print(0);
			return;
		}
		
		for(int i = -1; i < 2; i++) {
			for(int j = -1; j < 2; j++) {
				dfs(arr[0] + i, arr[1] + j, 2, Math.abs(i) + Math.abs(j));
			}
		}
		
		System.out.print(answer);
	}
	
	public static void dfs(int x, int y, int idx, int count) {
		if(idx == arr.length) {
			if(answer == -1 || answer > count) {
				answer = count;
			}
			return;
		}
		
		int num = y - x;
		if(arr[idx] - y == num) {
			dfs(y, arr[idx], idx + 1, count);
		}
		else if(arr[idx] + 1 - y == num) {
			dfs(y, arr[idx] + 1, idx + 1, count + 1);
		}
		else if(arr[idx] - 1 - y == num) {
			dfs(y, arr[idx] - 1, idx + 1, count + 1);
		}
		return;
	}
}
