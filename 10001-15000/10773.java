import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		int count = 0;
		while(n --> 0) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				if(count != 0) {
					count--;
				}
				arr[count] = 0;
			}
			else {
				arr[count] = num;
				count++;
			}
		}
		
		int sum = 0;
		for(int a : arr) {
			sum += a;
		}
		System.out.print(sum);
	}
}
