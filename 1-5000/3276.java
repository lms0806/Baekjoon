import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int max = Integer.MAX_VALUE;
		
		int minsum = max, minx = max, miny = max;
		for(int i = 1; i <= n; i++) {
			int j = n % i == 0 ? n / i : n / i + 1;
			
			if(i + j < minsum) {
				minsum = i + j;
				minx = i;
				miny = j;
			}
		}
		System.out.print(minx + " " + miny);
	}
}
