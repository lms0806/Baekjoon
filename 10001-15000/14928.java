import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String arr = br.readLine();
		long result = 0;
	    
		for(int i = 0; i < arr.length(); i++) {
			result = (result * 10 + (arr.charAt(i) - '0')) % 20000303;
		}
		System.out.print(result);
	}
}
