import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine()), d = Integer.parseInt(br.readLine());
		int s = Integer.parseInt(br.readLine());
		
		int suma = sum(a, b, s), sumb = sum(c, d, s);
		
		System.out.print(suma > sumb ? "Nikky" : suma == sumb ? "Tied" : "Byron");
	}
	
	public static int sum(int a, int b, int s) {
		int sum = 0, count = 0;
		while(true) {
			if(count + a > s) {
				sum += s - count;
				break;
			}
			else {
				sum += a;
			}
			count += a;
			
			if(count + b > s) {
				sum -= (s - count);
				break;
			}
			else {
				sum -= b;
			}
			count += b;
		}
		return sum;
	}
}
