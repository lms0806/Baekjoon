import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		for(int i = 1; i < a; i++) {
			sum += i;
		}
		
		int result = 1;
		for(int i = a; i <= b; i++) {
			sum += i;
			result *= sum;
			result %= 14579;
		}
		
		System.out.println(result);
	}
}
