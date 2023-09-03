import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.print(6 * Math.sqrt((Double.parseDouble(br.readLine()) * 2 / 3 / Math.sqrt(3))));
	}
}
