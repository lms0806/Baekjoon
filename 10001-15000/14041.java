import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		
		int n = Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken());
		
		int count = 120;
		while(count != 0) {
			n += (420 <= n && n < 600) || (900 <= n && n < 1140) ? 2 : 1;

			count--;
		}
		
		if(n >= 1440) {
			n -= 1440;
		}
		
		System.out.print(String.format("%02d", n / 60) + ":" + String.format("%02d", n % 60));
	}
}
