import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int k = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i += (n / k)) {
			solve(i, n / k);
		}
		
		System.out.print(sb);
	}
	
	public static void solve(int s, int len) {
		int[] list = new int[len];
		for(int i = 0; i < len; i++) {
			list[i] = arr[i + s];
		}
		
		Arrays.sort(list);
		
		for(int l : list) {
			sb.append(l).append(" ");
		}
	}
}
