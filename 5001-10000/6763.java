import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		if(b > a) {
			if(b-a <= 20) {
				System.out.println("You are speeding and your fine is $100.");
			}
			else if(b-a >= 21 && b-a <= 30) {
				System.out.println("You are speeding and your fine is $270.");
			}
			else if(b-a >= 31) {
				System.out.println("You are speeding and your fine is $500.");
			}
		}
		else {
			System.out.println("Congratulations, you are within the speed limit!");
		}
	}
}
