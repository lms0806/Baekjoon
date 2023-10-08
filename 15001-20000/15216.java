import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int h = Integer.parseInt(st.nextToken()), w = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		boolean flag = true;
		
		int sum = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			sum += num;
			
			if(sum > w) {
				flag = false;
				break;
			}
			
			if(sum == w) {
				sum = 0;
				h--;
			}
			
			if(h == 0) {
				break;
			}
		}
		System.out.print(flag ? "YES" : "NO");
	}
}
