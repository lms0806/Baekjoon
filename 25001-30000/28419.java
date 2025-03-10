import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long a = 0, b = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				a += Long.parseLong(st.nextToken());
			}
			else {
				b += Long.parseLong(st.nextToken());
			}
		}
		System.out.print(n == 3 && a > b ? -1 : Math.abs(a - b));
	}
}
