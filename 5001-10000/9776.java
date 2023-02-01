import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		double max = 0;
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char c = st.nextToken().charAt(0);
			
			double r = Double.parseDouble(st.nextToken());
			
			if(c == 'S') {
				max = Math.max(max, (4.0 / 3.0) * 3.14159 * r * r * r);
			}
			else {
				double h =  Double.parseDouble(st.nextToken());
				if(c == 'L') {
					max = Math.max(max, 3.14159 * r * r * h);
				}
				else {
					max = Math.max(max, (1.0 / 3.0) * 3.14159 * r * r * h);
				}
			}
		}
		System.out.print(String.format("%.3f", max));
	}
}
