import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, k;
	static int[] result;
	static int answer = Integer.MIN_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		result = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			result[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0, arr);
		
		System.out.print(answer);
	}
	
	public static void dfs(int depth, int[] arr) {
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i] == result[i]) {
				count++;
			}
		}
		answer = Math.max(answer, count);
		
		if(depth == k) {
			return;
		}
		
		for(int i = 0; i < n; i++) {
			int[] temp = arr.clone();
			
			for(int j = i; j < n - 1; j++) {
				temp[j] = temp[j + 1];
			}
			temp[n - 1] = 0;
			
			dfs(depth + 1, temp);
			
			temp = arr.clone();
			for(int j = n - 1; j > i; j--) {
				temp[j] = temp[j - 1];
			}
			temp[i] = 0;
			dfs(depth + 1, temp);
		}
	}
}
