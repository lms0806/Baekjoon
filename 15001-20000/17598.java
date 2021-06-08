import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = 0;
		for(int i = 0; i < 9; i++) {
			n += br.readLine().equals("Lion") ? 1 : -1;
		}
		
		System.out.print(n > 0 ? "Lion" : "Tiger");
	}
}
