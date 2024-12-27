import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			long n = Long.parseLong(br.readLine());
			
			long answer = 0;
			long s = 1, e = Integer.MAX_VALUE;
			while(s <= e) {
				long mid = (s + e) >> 1;
				
				if((mid * (mid + 1)) >> 1 <= n) {
					s = mid + 1;
					answer = mid;
				}
				else {
					e = mid - 1;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
