import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int num = Integer.parseInt(br.readLine());
		
		int a = 0, b = 1, c = 0;
		
		for(int i = 2; i < num+1; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		if(num == 1) {
			c = 1;
		}
		
		System.out.println(c);
	}
}
