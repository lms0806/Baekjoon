import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long s = Long.parseLong(st.nextToken()), k = Long.parseLong(st.nextToken());
		
		long result = 1;
		long mul = s / k;
		long count = s - (mul * k);
		
		for(int i = 0; i < k - count; i++) {
			result *= mul;
		}
		
		for(int i = 0; i < count; i++) {
			result *= (mul + 1);
		}
		
		System.out.print(result);
	}
}
