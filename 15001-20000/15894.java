import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		long a, sum;
		
		a = Long.parseLong(br.readLine());
		
		sum = a * 4;
		
		System.out.println(sum);
		
		br.close();
	}
}
