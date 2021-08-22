import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		long[] num = new long[size + 1];
		
		num[0] = 1;
		for(int i = 1; i <= size; i++) {
			for(int j = 0; j < i; j++) {
				num[i] += num[j] * num[i - j - 1];
			}
		}
		
		System.out.print(num[size]);
	}
}
