import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		for(int i = 0; i < 3; i++) {
			String s = br.readLine();
			
			if(!s.equals("FizzBuzz") && !s.equals("Fizz") && !s.equals("Buzz")) {
                System.out.print(solve(Integer.parseInt(s) + 3 - i));
				break;
			}
        }
	}
	
	public static String solve(int n) {
		if(n % 3 == 0) {
			return n % 5 == 0 ? "FizzBuzz" : "Fizz";
		}
		return n % 5 == 0 ? "Buzz" : n + "";
	}
}
