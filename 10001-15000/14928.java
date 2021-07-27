import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		long result = 0;
		for(char ch : br.readLine().toCharArray()) {
			result = (result * 10 + (ch - '0')) % 20000303;
		}
		System.out.print(result);
	}
}
