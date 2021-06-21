import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		int a = 1, b = 0, temp;
		
		while(size --> 0) {
			temp = a;
			a = b;
			b += temp;
		}
		
		System.out.print(a + " " + b);
	}
}
