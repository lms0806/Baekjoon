import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[k];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		for(int a : arr) {
			sb.append(solve(a * 100 / n)).append(" ");
		}
		System.out.print(sb);
	}
	
	public static int solve(int n) {
		return n <= 4 ? 1 : n <= 11 ? 2 : n <= 23 ? 3 : n <= 40 ? 4 : n <= 60 ? 5 : n <= 77 ? 6 : n <= 89 ? 7 : n <= 96 ? 8 : 9;
	}
}
