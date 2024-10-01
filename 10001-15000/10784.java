import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double p = Double.parseDouble(st.nextToken());
		double a = Double.parseDouble(st.nextToken()), b = Double.parseDouble(st.nextToken());
		double c = Double.parseDouble(st.nextToken()), d = Double.parseDouble(st.nextToken());;
		
		int n = Integer.parseInt(st.nextToken());
		
		double max = p * (Math.sin(a + b) + Math.cos(c + d) + 2);
		
		double answer = 0;
		for(int k = 2; k <= n; k++) {
			double price = p * (Math.sin(a * k + b) + Math.cos(c * k + d) + 2);
			
			max = Math.max(max, price);
			answer = Math.max(answer, max - price);
		}
		System.out.print(answer);
	}
}
