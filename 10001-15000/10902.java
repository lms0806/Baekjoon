import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		long f = 0, tf = 0, sf = 0, max = 0; 
		
		for(int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long t = Long.parseLong(st.nextToken()), s = Long.parseLong(st.nextToken());
			
			if(s > max) {
				max = s;
				f = i;
				tf = t;
				sf = s;
			}
		}
		
		System.out.print(sf == 0 ? 0 : tf + (f - 1) * 20);
	}
}
