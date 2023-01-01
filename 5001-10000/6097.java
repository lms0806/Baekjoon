import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		BigInteger n = new BigInteger(st.nextToken()).pow(Integer.parseInt(st.nextToken()));
		
		String s = String.valueOf(n);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i += 70) {
			String str = s.substring(i);
			
			sb.append(str.length() >= 70 ? s.substring(i, i + 70) : str).append("\n");
		}
		System.out.print(sb);
	}
}
