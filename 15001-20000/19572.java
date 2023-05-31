import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double d1 = Double.parseDouble(st.nextToken()), d2 = Double.parseDouble(st.nextToken()), d3 = Double.parseDouble(st.nextToken());
		
		double sum = d1 + d2 + d3;
		
		System.out.print(solve(sum / 2 - d3, sum / 2 - d2, sum / 2 - d1));
	}
	
	public static String solve(double a, double b, double c) {
		return a <= 0 || b <= 0 || c <= 0 ? "-1" : "1\n" + a + " " + b + " " + c;
	}
}
