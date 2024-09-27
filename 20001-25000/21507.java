import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		BigInteger n = new BigInteger(st.nextToken()).min(new BigInteger(st.nextToken())).add(new BigInteger(st.nextToken()).min(new BigInteger(st.nextToken())));
		
		System.out.print(n.sqrt());
	}
}
