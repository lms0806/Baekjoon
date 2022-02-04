import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double a1 = Double.parseDouble(st.nextToken()), p1 = Double.parseDouble(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		double r1 = Double.parseDouble(st.nextToken()), p2 = Double.parseDouble(st.nextToken());
		
		double x = r1 * r1 * Math.PI;
		double a = a1 / p1;
		double b = x / p2;
		
		System.out.print(a < b ? "Whole pizza" : "Slice of pizza");
	}
}
