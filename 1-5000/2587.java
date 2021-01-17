import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] num = new int[5];
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			num[i] = Integer.parseInt(br.readLine());
			sum += num[i];
		}
		sum/=5;
		
		Arrays.sort(num);
		
		int number = 0;
		if(num.length%2 == 0) {
			number = (num[num.length / 2] + num[num.length / 2 + 1]) / 2;
		}
		else {
			number = num[num.length/2];
		}
		System.out.println(sum);
		System.out.println(number);
	}
}
