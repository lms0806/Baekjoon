import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] one = new int[50], two = new int[50];
		
		for(int i = 0; i < 50; i++) {
			one[i] = i * 2 + 1;
		}
		for(int i = 0; i < 50; i++) {
			two[i] = (i + 1) * 2;
		}
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			if(n % 2 == 1) {
				sb.append(search(n, one) + 1);
			}
			else {
				sb.append(search(n, two));
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	public static int search(int n, int[] arr) {
		int answer = 1;
		int l = 0, r = 49;
		while(l <= r) {
			int m = (l + r) / 2;
			
			if(arr[m] == n) {
				break;
			}
			
			if(arr[m] < n) {
				l = m + 1;
			}
			else {
				r = m - 1;
			}
			answer++;
		}
		return answer;
	}
}
