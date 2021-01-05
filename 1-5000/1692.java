import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a, b, c;
		
		a = Long.parseLong(st.nextToken());
		b = Long.parseLong(st.nextToken());
		c = Long.parseLong(st.nextToken());
		
		long ans = 1;
		long num = a % c;
		
		while(b > 0){
			if(b % 2 == 1){
				ans *= num;
				ans %= c;
			}
			num = ((num % c) * (num % c)) % c;
			b /= 2;
		}
		System.out.println(ans);
	}
}
