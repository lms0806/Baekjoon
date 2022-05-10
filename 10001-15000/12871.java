import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String a = br.readLine(), b = br.readLine();
		String aa = "", bb = "";
		
		int temp = lcm(a.length(), b.length());
		
		for(int i = 0; i < temp / a.length(); i++) {
			aa += a;
		}
		for(int i = 0; i < temp / b.length(); i++) {
			bb += b;
		}
		
		System.out.print(aa.equals(bb) ? 1 : 0);
	}
	
	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
	
	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
}
