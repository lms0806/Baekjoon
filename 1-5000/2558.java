import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int sum = Integer.parseInt(br.readLine());
		sum += Integer.parseInt(br.readLine());
		
		System.out.println(sum);
	}
}
