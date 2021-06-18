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
			double a = 0, b = 0, c = 0;
			
			for(int i = 0; i < 10; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				a += Integer.parseInt(st.nextToken());
				b += Integer.parseInt(st.nextToken());
				c += Integer.parseInt(st.nextToken());
			}
			
			sb.append(Math.round(a/10)).append(" ").append(Math.round(b/10)).append(" ").append(Math.round(c/10)).append("\n");
		}
		System.out.print(sb);
	}
}
