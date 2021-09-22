import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] nrgs) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());
		
		long[] n = new long[size];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < size; i++) {
			n[i] = Integer.parseInt(st.nextToken());
		}
		
		long p = 1, q = n[size - 1];
		for(int i = size - 2; i >= 0; i--) {
			p += q * n[i];
			
			long temp = p;
			p = q;
			q = temp;
		}
		
		System.out.print(q - p + " " + q);
	}
}
