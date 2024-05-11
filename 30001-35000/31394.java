import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int sum = 0;
		boolean three = false;
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			
			sum += num;
			
			if(num == 3) {
				three = true;
			}
		}
		
		System.out.print(solve(n, sum, three));
	}
	
	public static String solve(int n, int sum, boolean three) {
		return three ? "None" : sum / n == 5 ? "Named" : 2 * sum >= 9 * n ? "High" : "Common";
	}
}
