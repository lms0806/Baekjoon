import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int sum = 0, num = 0, count = 0, number = 1;
		while(true) {
			if(number*number >= m && number*number <= n) {
				sum += number*number;
				count++;
				if(count == 1) {
					num = number*number;
				}
			}
			if(number*number > n) {
				break;
			}
			number++;
		}
		
		StringBuilder sb = new StringBuilder();
		if(num == 0) {
			sb.append("-1");
		}
		else {
			sb.append(sum).append("\n");
			sb.append(num).append("\n");
		}
		System.out.print(sb);
	}
}
