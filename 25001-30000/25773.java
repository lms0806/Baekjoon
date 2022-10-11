import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		char[] ch = br.readLine().toCharArray();
		
		Arrays.sort(ch);
	
		System.out.print(new StringBuilder(new String(ch)).reverse());
	}
}
