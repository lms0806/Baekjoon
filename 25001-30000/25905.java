import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		double[] arr = new double[10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = Double.parseDouble(br.readLine());
		}
		
		Arrays.sort(arr);
		
		double answer = 1;
		for(int i = 1; i < 10; i++) {
			answer *= arr[i] / i;
		}
		
		System.out.print(answer * 1000000000);
	}
}
