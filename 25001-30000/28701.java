import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int sum = 0, threeSum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
			threeSum += Math.pow(i, 3);
		}
		
		System.out.print(sum + "\n" + (sum * sum) + "\n" + threeSum);
	}
}
