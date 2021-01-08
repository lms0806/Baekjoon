import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		int a;
		int quarter = 0, dime = 0, nickel = 0, penny = 0;
		for(int i = 0; i < size; i++) {
			a = Integer.parseInt(br.readLine());
			quarter = a/25;
			a%=25;
			dime = a/10;
			a%=10;
			nickel = a/5;
			a%=5;
			penny = a;
			System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
		}
	}
}
