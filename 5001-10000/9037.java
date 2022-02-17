import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			if(n == 1) {
				sb.append(0);
			}
			else {
				int round = 0;
				while(!check(arr)) {
					make_even(arr);
					
					if(check(arr)) {
						break;
					}
					
					solve(arr);
					
					round++;
				}
				sb.append(round);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	public static void solve(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] /= 2;
		}
		
		int temp = arr[0], temp1 = 0;
		for(int i = 0; i < arr.length; i++) {
			if(i == 0) {
				arr[i] += arr[arr.length - 1];
			}
			else {
				temp1 = arr[i];
				arr[i] += temp;
				temp = temp1;
			}
		}
	}
	
	public static void make_even(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				arr[i]++;
			}
		}
	}
	
	public static boolean check(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] != arr[i - 1]) {
				return false;
			}
		}
		return true;
	}
}
