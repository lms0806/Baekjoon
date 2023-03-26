import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char c = br.readLine().charAt(0);
		
		System.out.print(c == 'N' ? "North London Collegiate School" : c == 'B' ? "Branksome Hall Asia" : c == 'K' ? "Korea International School" : "St. Johnsbury Academy");
	}
}
