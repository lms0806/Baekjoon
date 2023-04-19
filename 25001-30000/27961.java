import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		
		long sum = 1, count = 1;
		while(n > sum) {
			sum *= 2;
			count++;
		}
		System.out.print(n == 0 ? 0 : count);
	}
}
