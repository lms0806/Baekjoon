import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		long idx1 = 0, idx2 = 0;
		long max = Long.MIN_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			long num = Long.parseLong(st.nextToken());
			
			if(num > max) {
				max = num;
				idx1 = idx2 = i;
			}
			else if(num == max) {
				idx2 = i;
			}
		}
		
		System.out.print(idx1 - 1 < n - idx2 ? "R" : idx1 - 1 == n - idx2 ? "X" : "B");
	}
}
