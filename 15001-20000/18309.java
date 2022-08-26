import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int min = Integer.MAX_VALUE, max = -Integer.MAX_VALUE;
		String s;
		while((s = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(s);
			st.nextToken();
			
			while(st.hasMoreTokens()) {
				int a = Integer.parseInt(st.nextToken());
				if(a < min) {
					min = a;
				}
				if(a > max) {
					max = a;
				}
			}
		}
		System.out.print(min + " " + max);
	}
}
