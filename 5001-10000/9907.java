import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] arr = {2, 7, 6, 5, 4, 3, 2};
		
		int sum = 0;
		
		String s = br.readLine();
		for(int i = 0; i < s.length(); i++) {
			sum += (s.charAt(i) - '0') * arr[i];
		}
		System.out.print(answer(sum % 11));
	}
	
	public static char answer(int sum) {
		return sum == 0 ? 'J' : sum == 10 ? 'Z' : (char)(sum + 64);
	}
}
