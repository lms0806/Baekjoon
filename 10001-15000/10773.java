import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		int size = Integer.parseInt(br.readLine());
		
		int[] num = new int[size];
		
		int count = 0;
		for(int i = 0; i < size; i++) {
			int number = Integer.parseInt(br.readLine());
			if(number == 0) {
				if(count != 0) {
					count--;
				}
				num[count] = 0;
			}
			else {
				num[count] = number;
				count++;
			}
		}
		
		int sum = 0;
		for(int i = 0; i < size; i++) {
			if(num[i] != 0) {
				sum += num[i];
			}
		}
		System.out.println(sum);
	}
}
