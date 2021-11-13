import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int sum = 0;
			for(char c : br.readLine().toCharArray()) {
				sum += c - '0';
			}
			
			if(sum == 0) {
				break;
			}
			
			while(sum > 9) {
				int sums = sum;
				sum = 0;
				while(sums > 0) {
					sum += sums % 10;
					sums /= 10;
				}
			}
			sb.append(sum).append("\n");
		}
		System.out.print(sb);
	}
}
