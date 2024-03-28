import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		System.out.print(solve(Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken()) - 1));
	}
	
	public static int solve(int n, int k) {
		if(n == 0) {
			return 0;
		}
		if(k == 0) {
			return -1;
		}
		return n % k == 0 ? n / k : -1;
	}
}
