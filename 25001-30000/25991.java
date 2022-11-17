import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		double sum = 0;
		while(t --> 0) {
			double x = Double.parseDouble(st.nextToken());
			
			sum += x * x * x;
		}
		
		System.out.println(Math.cbrt(sum));
	}
}
