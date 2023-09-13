import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		long sum = 0;
		for(char c : br.readLine().toCharArray()) {
			sum *= 26;
			sum += c - 'A' + 1;
		}
		System.out.print(sum);
	}
}
