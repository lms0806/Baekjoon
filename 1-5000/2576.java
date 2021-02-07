import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] num = new int[7];
		int[] num1 = new int[7];
		
		int sum = 0;
		int count = 0;
		for(int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(br.readLine());
			if(num[i]%2 != 0) {
				num1[i] = num[i];
				sum += num[i];
				count++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		if(count == 0) {
			sb.append("-1").append("\n");
		}
		else {
			Arrays.sort(num1);
			
			System.out.println(sum);
			for(int i = 0; i < num1.length; i++) {
				if(num1[i] != 0) {
					sb.append(num1[i]).append("\n");
					break;
				}
			}
		}
		System.out.print(sb);
	}
}
