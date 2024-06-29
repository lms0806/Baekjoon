import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(n).append(":\n");
		for (int i = 2; i <= n / 2 + 1; i++) {
	        for(int j = i - 1; j <= i; j++) {
	            if (j <= 0) {
	                continue;
	            }
	            
	            if ((i == j && n % i == 0) || (n - i) % (i + j) == 0 || n % (i + j) == 0) {
	            	sb.append(i).append(",").append(j).append("\n");
	            }
	        }
	    }
		System.out.print(sb);
	}
}
