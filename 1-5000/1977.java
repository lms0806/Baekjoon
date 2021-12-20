import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int m = Integer.parseInt(br.readLine()), n = Integer.parseInt(br.readLine());
		
		int sum = 0, num = 0, count = 0, number = 1;
		while(number <= n) {
			int numbers = number * number;
			if(numbers >= m && numbers <= n) {
				sum += numbers;
				count++;
				if(count == 1) {
					num = numbers;
				}
			}
			number++;
		}
		
		System.out.print(num == 0 ? -1 : sum + "\n" + num);
	}
}
