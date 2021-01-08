import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int a = Integer.parseInt(br.readLine());
		int num = 1;
		
		for(int i = 1; i <= a; i++) {
			num *= i;
			num %= 10;
		}
		System.out.println(num);
	}
}
