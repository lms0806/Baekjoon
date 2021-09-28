import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int[] num = new int[size + 1];
		num[0] = 0;
		num[1] = 1;
		
		for(int i = 2; i <= size; i++) {
			num[i] = num[i - 1] + num[i - 2];
		}
		System.out.print(num[size]);
	}
}
