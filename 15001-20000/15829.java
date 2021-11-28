import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		br.readLine();
		
		long sum = 0, r = 1;
		
		for(char ch : br.readLine().toCharArray()) {
			sum = (sum + (ch - 'a' + 1) * r) % 1234567891;
			
			r = r * 31 % 1234567891;
		}
		System.out.print(sum);
	}
}
