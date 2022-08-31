import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine()) + 2400 - 2013;
		
		System.out.print((char)((n + 5) % 12 + 'A') + "" + ((n + 9) % 10));
	}
}
