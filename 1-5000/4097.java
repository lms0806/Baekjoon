import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int size = Integer.parseInt(br.readLine());
			
			if(size == 0) {
				break;
			}
			
			int max = Integer.MIN_VALUE, sum = 0;
			while(size --> 0) {
				sum += Integer.parseInt(br.readLine());
				max = Math.max(max, sum);
				
				if(sum < 0) {
					sum = 0;
				}
			}
			sb.append(max).append("\n");
		}
		System.out.print(sb);
	}
}
