import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double[] num = new double[3];
		
		double max = 0;
		for(int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double a = Double.parseDouble(st.nextToken()), b = Double.parseDouble(st.nextToken());
			
			if(a * 10 >= 5000) {
				a = a * 10 - 50;
			}
			else {
				a *= 10;
			}
			b *= 10;
			num[i] = b / a;
			max = Math.max(max, num[i]);
		}
		
		System.out.print(max == num[0] ? "S" : max == num[1] ? "N" : "U");
	}
}
