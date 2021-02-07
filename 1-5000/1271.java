import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken();
		String b = st.nextToken();
		
		StringBuilder sb = new StringBuilder();
		sb.append(new BigInteger(a).divide(new BigInteger(b))).append("\n");
		sb.append(new BigInteger(a).remainder(new BigInteger(b))).append("\n");
		System.out.print(sb);
	}
}
