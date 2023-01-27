import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		int l = Integer.parseInt(br.readLine()), r = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = l; i <= r; i++) {
			if(x != i && isprime(gcd(x, i))) {
				arr.add(i);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(arr.size()).append("\n");
		for(int a : arr) {
			sb.append(a).append(" ");
		}
		System.out.print(sb);
	}
	
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
	
	public static boolean isprime(int n) {
		for(int i = 2; i * i <= n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
