import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		long num = Long.parseLong(br.readLine());
		
		long a = 0, b = 1, c = 0;
		
		for(int i = 1; i < num; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		if(num == 1) {
			c = 1;
		}
		
		System.out.print(c);
	}
}
