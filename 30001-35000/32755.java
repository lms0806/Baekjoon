import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n + 1];
		for(int i = 1; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[Integer.parseInt(st.nextToken())]++;
			arr[Integer.parseInt(st.nextToken())]++;
		}
		
		System.out.print(solve(n, arr));
	}
	
	public static int solve(int n, int[] arr) {
		for(int a : arr) {
			if(a == n - 1) {
				return n - 1;
			}
		}
		return n;
	}
}
