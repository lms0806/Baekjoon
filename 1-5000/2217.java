import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int[] num = new int[size];
		
		for(int i = 0; i < size; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(num);
		
		long answer = 0;
		for(int i = size - 1; i >= 0; i--) {
			answer = Math.max(answer, num[i] * (size - i));
		}
		System.out.print(answer);
	}
}
