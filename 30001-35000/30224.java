import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s = br.readLine();
		int num = Integer.parseInt(s);
		
		System.out.print(!s.contains("7") ? num % 7 != 0 ? 0 : 1 : num % 7 != 0 ? 2 : 3);
	}
}
