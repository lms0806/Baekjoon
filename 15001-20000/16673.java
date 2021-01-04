import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int c, k, p, sum = 0;
		
		c = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		p = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i <= c; i++) {
			sum += k*i + p * Math.pow(i, 2);
		}

		System.out.println(sum);
		br.close();
	}
}
