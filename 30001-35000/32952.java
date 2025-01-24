import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long r = Long.parseLong(st.nextToken()), k = Long.parseLong(st.nextToken()), m = Long.parseLong(st.nextToken());
		
		long num = m / k;
		
		while(num --> 0 && r > 0) {
			r >>= 1;
		}
		System.out.print(r);
	}
}
