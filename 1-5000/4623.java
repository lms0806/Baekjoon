import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
			
			if(a == 0 && b == 0 && c == 0 && d == 0) {
				break;
			}
			
			if(a < b) {
				int temp = a;
				a = b;
				b = temp;
			}
			
			if(c < d) {
				int temp = c;
				c = d;
				d = temp;
			}
			
			int answer = 0;
			int s = 1, e = 100;
			while(s <= e) {
				int mid = (s + e) / 2;
				
				if(a * mid <= c * 100 && b * mid <= d * 100) {
					s = mid + 1;
					answer = mid;
				}
				else {
					e = mid - 1;
				}
			}
			
			sb.append(answer).append("%\n");
		}
		System.out.print(sb);
	}
}
