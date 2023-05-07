import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double d1 = Double.parseDouble(st.nextToken()), d2 = Double.parseDouble(st.nextToken());
		double x = Double.parseDouble(st.nextToken());
		
		if(d1 < d2) {
			double temp = d1;
			d1 = d2;
			d2 = temp;
		}
		
		double v1 = x / (100 * d1);
		double v2 = (100 - x) / (100 * d2);
		
		System.out.print(String.format("%06f", 1 / (v1 + v2)));
	}
}
