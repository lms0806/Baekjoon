import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int l = Integer.parseInt(br.readLine());
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		if(a%c != 0) {
			num1= a/c +1;
		}
		else {
			num1 = a/c;
		}
		
		if(b%d != 0) {
			num2 = b/d + 1;
		}
		else {
			num2 = b/d;
		}
		
		if(num1 > num2) {
			result = l - num1;
		}
		else {
			result = l - num2;
		}
		
		System.out.println(result);
	}
}
