import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long d = Long.parseLong(st.nextToken()), m = Long.parseLong(st.nextToken()), w = Long.parseLong(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		long i = Long.parseLong(st.nextToken()), j = Long.parseLong(st.nextToken()), k = Long.parseLong(st.nextToken());
		
		System.out.print((char)('a' + ((k - 1) * m * d + (j - 1) * d + i - 1) % w));
	}
}
