import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder answer = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("#")) {
				break;
			}
			
			int n = Integer.parseInt(br.readLine());
			int num = Integer.parseInt(br.readLine());
			
			answer.append(s).append(", ").append(num).append(", ");
			
			StringBuilder sb = new StringBuilder();
			while(num != 0) {
				if(num % n > 9) {
					sb.append((char)(num % n - 10 + 'A'));
				}
				else {
					sb.append(num % n);
				}
				
				num /= n;
			}
			answer.append(sb.reverse()).append("\n");
		}
		System.out.print(answer);
	}
}
