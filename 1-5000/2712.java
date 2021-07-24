import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double n = Double.parseDouble(st.nextToken());
			String s = st.nextToken();
			
			n *= s.equals("kg") ? 2.2046 : s.equals("lb") ? 0.4536 : s.equals("l") ? 0.2642 : 3.7854;
			s = s.equals("kg") ? "lb" : s.equals("lb") ? "kg" : s.equals("l") ? "g" : "l";
			
			sb.append(String.format("%.4f", n)).append(" ").append(s).append("\n");
		}
		System.out.print(sb);
	}
}
