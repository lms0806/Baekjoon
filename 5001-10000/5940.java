import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()) + 1, b = Integer.parseInt(st.nextToken());
		
		System.out.print(solve(a, b));
	}
	
	public static int solve(int a, int b) {
		for(int i = a + 1; i <= 62; i++) {
			long num = (long) Math.pow(2, i);
			
			num /= Math.pow(10, Long.toString(num).length() - 1);
			
			if(num == b) {
				return i;
			}
		}
		return 0;
	}
}
