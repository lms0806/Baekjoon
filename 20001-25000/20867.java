import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double m = change(st.nextToken()), s = change(st.nextToken()), g = change(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		double a = change(st.nextToken()), b = change(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		double l = change(st.nextToken()), r = change(st.nextToken());
		
		double stand = m / s + r / b, walk = m / g + l / a;
		
		System.out.print(stand < walk ? "latmask" : "friskus");
	}
	
	public static double change(String s) {
		return Double.parseDouble(s);
	}
}
