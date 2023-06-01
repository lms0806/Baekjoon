import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double a = Double.parseDouble(st.nextToken()), b = Double.parseDouble(st.nextToken());
		
		int plus = (int) (-a + Math.sqrt(a * a - b));
		int minus = (int) (-a - Math.sqrt(a * a - b));
		
		System.out.print(plus == minus ? plus : minus + " " + plus);
	}
}
