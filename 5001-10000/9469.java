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
			int n = Integer.parseInt(st.nextToken());
			double d = change(st.nextToken());
			double a = change(st.nextToken()), b = change(st.nextToken());
			double f = change(st.nextToken());
			
			double answer = d / (a + b) * f;
			sb.append(n).append(" ").append(String.format("%.6f", answer)).append("\n");
		}
		System.out.print(sb);
		
	}
	
	public static double change(String s) {
		return Double.parseDouble(s);
	}
}
