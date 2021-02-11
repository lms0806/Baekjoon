import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int num = Integer.parseInt(br.readLine());
		
		int a = 0, b = 1, c = 0;
		
		if(num == 1) {
			c = 1;
		}
		else{
			while(num-->1) {
				c = a + b;
				a = b;
				b = c;
			}
		}
		
		System.out.print(c);
	}
}
