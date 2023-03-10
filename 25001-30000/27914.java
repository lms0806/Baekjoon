import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		double x = Double.parseDouble(st.nextToken()) * 60, y = Double.parseDouble(st.nextToken()) * 60;
		
		System.out.print((int)(Math.ceil(Math.max(0.0, m / x + (n - m) / y - t))));
	}
}
