import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		long n = Long.parseLong(br.readLine());
		long m = -n;
		
		int count = 0;
		for(int i = 0; i < 32; i++) {
			if((n & 1) != (m & 1)) {
				count++;
			}
			n >>= 1;
			m >>= 1;
		}
		System.out.print(count);
	}
}
