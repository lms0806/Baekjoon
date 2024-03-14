import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double a = Double.parseDouble(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		double n = Double.parseDouble(st.nextToken()), m = Double.parseDouble(st.nextToken());
		
		if(m > n) {
			double temp = n;
			n = m;
			m = temp;
		}
		
		System.out.print(Math.min(m / a * 2, Math.max(m, n / a)));
	}
}
