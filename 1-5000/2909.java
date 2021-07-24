import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int c = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		int size = (int)Math.pow(10, k);
		
		
		int n = (c % size) / (int)Math.pow(10, k - 1);
		
		c /= size;
		if(n > 4) {
			c += 1;
		}
		c *= size;
		
		System.out.print(c);
	}
}
