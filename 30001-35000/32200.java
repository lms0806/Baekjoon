import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
		
		int sum = 0, count = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num < x) {
				sum += num;
			}
			else {
				int t = num / x;
				count += t;
				num -= y * t;
				
				if(num > 0) {
					sum += num;
				}
			}
		}
		System.out.print(count + "\n" + sum);
	}
}
