import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int answer = 0, num = Integer.MAX_VALUE;
		for(int i = 1; i <= t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int price = Integer.parseInt(st.nextToken());
			
			int zero = 0, one = 0, two = 0;
			for(char c : st.nextToken().toCharArray()) {
				if(c == '0') {
					zero++;
				}
				else if(c == '1') {
					one++;
				}
				else if(c == '2') {
					two++;
				}
			}
			
			if(zero >= 1 && one >= 1 && two >= 2) {
				if(price < num) {
					answer = i;
					num = price;
				}
			}
		}
		System.out.print(answer);
	}
}
