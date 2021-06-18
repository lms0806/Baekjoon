import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());

		int count = 0;
		while(a > 0 && b > 1) {
			a -= b;
			b /= 2;
			count++;
		}
		
		if(a > 0) {
			count += a;
		}
		
		System.out.print(count);
	}
}
