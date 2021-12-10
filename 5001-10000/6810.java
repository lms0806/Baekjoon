import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s = "9780921418";
		
		for(int i = 0; i < 3; i++) {
			s += br.readLine();
		}
		
		int sum = 0;
		for(int i = 0; i < s.length(); i++) {
			int c = s.charAt(i) - '0';
			if(i % 2 == 0) {
				sum += c * 1;
			}
			else {
				sum += c * 3;
			}
		}
		System.out.print("The 1-3-sum is " + sum);
	}
}
