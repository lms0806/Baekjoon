import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double b = Double.parseDouble(st.nextToken()), weight = Double.parseDouble(st.nextToken());
			
			double total = 0;
			for(int j = 1; j <= b; j++) {
				total += 4.0 / 3.0 * 3.14159265359 * Math.pow(Double.parseDouble(br.readLine()), 3) / 1000;
			}
			
			sb.append("Data Set ").append(i).append(": \n").append(total >= weight ? "Yes" : "No").append("\n\n");
		}
		System.out.print(sb);
	}
}
