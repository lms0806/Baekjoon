import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int h = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken()) + 1;
		
		if(s >= 60) {
			s -= 60;
			m++;
		}
		
		if(m >= 60) {
			m -= 60;
			h++;
		}
		
		if(h >= 24) {
			h -= 24;
		}
		
		System.out.print(print(h) + ":" + print(m) + ":" + print(s));
	}
	
	public static String print(int n) {
		return String.format("%02d", n);
	}
}
