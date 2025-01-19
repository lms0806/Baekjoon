import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n - 1];
		
		int before = Integer.parseInt(br.readLine());
		for(int i = 1; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			
			arr[i - 1] = num - before;
			before = num;
		}
		
		int gcd = arr[0];
		for(int i = 1; i < arr.length; i++) {
			gcd = gcd(gcd, arr[i]);
		}
		
		int answer = 0;
		for(int i = 0; i < arr.length; i++) {
			answer += arr[i] / gcd - 1;
		}
		System.out.print(answer);
	}
	
	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}
