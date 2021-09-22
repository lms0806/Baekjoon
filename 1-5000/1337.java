import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int[] num = new int[n];
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(num);
		
		int max = 0;
		for(int i = 0; i < n; i++) {
			int end = num[i] + 4;
			int count = 0;
			for(int j = 0; j < n - i; j++) {
				if(num[i + j] <= end) {
					count++;
				}
				else {
					break;
				}
			}
			max = Math.max(max, count);
		}
		System.out.print(5 - max);
	}
}
