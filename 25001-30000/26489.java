import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s;
		int n = 0;
		while((s = br.readLine()) != null) {
			n++;
		}
		System.out.print(n);
	}
}
