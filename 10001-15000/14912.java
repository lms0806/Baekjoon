import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] nrgs) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			int num = i;
			while(num != 0) {
				if(num % 10 == d) {
					answer++;
				}
				num /= 10;
			}
		}
		System.out.print(answer);
	}
}
