import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int h, w, n, answer = 0;
		
		for(int i = 0; i < size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			h = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			
			if(n % h == 0) {
				answer = (h * 100) + (n/h);
			}
			else {
				answer = (n%h)*100 + (n/h+1);
			}
			System.out.println(answer);
		}
	}
}
