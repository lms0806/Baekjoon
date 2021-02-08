import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] num = new int[42];
		
		for(int i = 0; i < 10; i++) {
			int number = Integer.parseInt(br.readLine()) % 42;
			num[number]++;
		}
		
		int count = 0;
		
		for(int i = 0; i < 42; i++) {
			if(num[i] != 0) {
				count++;
			}
		}
		
		System.out.print(count);
	}
}
