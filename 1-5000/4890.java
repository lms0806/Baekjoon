import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken());
			
			if(a == 0 && b == 0) {
				break;
			}
			
			if(a < b) {
				long temp = a;
				a = b;
				b = temp;
			}
			
			sb.append(a % b == 0 ? a / b : a * b).append("\n");
		}
		System.out.print(sb);
	}
}
