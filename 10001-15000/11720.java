import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int number = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		
		int sum = 0;
		for(int i = 0; i < str.length(); i++) {
			sum += str.charAt(i)-'0';
		}
		System.out.print(sum);
	}
}
