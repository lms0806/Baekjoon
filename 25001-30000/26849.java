import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		double min = Double.MAX_VALUE, max = Double.MIN_VALUE, sum = 0;
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			double a = Double.parseDouble(st.nextToken()), b = Double.parseDouble(st.nextToken());
			
			sum += a / b;
			min = Math.min(min, a / b);
			max = Math.max(max, a / b);
		}
		System.out.print(min + " " + max + " " + sum);
	}
}
