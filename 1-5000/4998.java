import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s;
		StringBuilder sb = new StringBuilder();
		while((s = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(s);
			
			double a = Double.parseDouble(st.nextToken());
			double b = 1 + Double.parseDouble(st.nextToken()) / 100;
			double c = Double.parseDouble(st.nextToken());
			
			int answer = 0;
			while(a < c) {
				a *= b;
				answer++;
			}
			
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
