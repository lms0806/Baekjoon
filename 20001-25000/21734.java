import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		StringBuilder sb = new StringBuilder();
		for(char ch : br.readLine().toCharArray()) {
			int num = ch;
			
			int count = 0;
			while(num != 0) {
				count += num % 10;
				num /= 10;
			}
			
			while(count --> 0) {
				sb.append(ch);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
