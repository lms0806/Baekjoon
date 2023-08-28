import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			double x = Double.parseDouble(st.nextToken()), y = Double.parseDouble(st.nextToken());
			
			sb.append(print(60 * (x - 1) / y)).append(" ").append(print(60 * x / y)).append(" ").append(print(60 * (x + 1) / y)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String print(double n) {
		return String.format("%.4f", n);
	}
}
