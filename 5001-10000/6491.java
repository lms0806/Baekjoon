import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = "";
		StringBuilder sb = new StringBuilder();
		while((str = br.readLine()) != null && str.length() != 0) {
			StringTokenizer st = new StringTokenizer(str);
			
			while(st.hasMoreTokens()) {
				long n = Long.parseLong(st.nextToken());
				
				if(n == 0) {
					break;
				}
				
				long num = 0;
				for(long i = 1; i <= n / 2; i++) {
					if(n % i == 0) {
						num += i;
					}
				}
				
				sb.append(n).append(" ").append(num > n ? "ABUNDANT" : num == n ? "PERFECT" : "DEFICIENT").append("\n");
			}
		}
		System.out.print(sb);
	}
}
