import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] num = new int[10];
		int[] num1 = new int[10];
		
		for(int i = 0; i < 10; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i < 10; i++) {
			num1[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(num);
		Arrays.sort(num1);
		
		int sum = num[9] + num[8] + num[7];
		int sum1 = num1[9] + num1[8] + num1[7];
		
		System.out.println(sum + " " + sum1);
	}
}
