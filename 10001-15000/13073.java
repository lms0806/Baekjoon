import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		int num, sum, even, odd;
		
		for(int i = 0; i < size; i++) {
			num = Integer.parseInt(br.readLine());
			
			sum = num*(num+1)/2;
			even = num*(num+1);
			odd = num*num;
			
			System.out.println(sum + " " + odd + " " + even);
		}
	}
}
