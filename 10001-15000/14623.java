import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		long a = Long.parseLong(br.readLine(), 2);
		long b = Long.parseLong(br.readLine(), 2);
		
		System.out.print(Long.toBinaryString(a*b));
	}
}
