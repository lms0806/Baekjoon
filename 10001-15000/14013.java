import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double a = Double.parseDouble(st.nextToken()), b = Double.parseDouble(st.nextToken());
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			double t = Double.parseDouble(st.nextToken());
			char c = st.nextToken().charAt(0);
			
			sb.append(c == 'A' ? t / a * b : t / b * a).append("\n");
		}
		System.out.print(sb);
	}
}
