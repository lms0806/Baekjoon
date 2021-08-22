import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		char[] ch = new char[Integer.parseInt(br.readLine())];
		Arrays.fill(ch, 'a');
		System.out.print(ch);
	}
}
