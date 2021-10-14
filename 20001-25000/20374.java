import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		long a = 0, b = 0;
		String s = "";
		while((s = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(s, ".");
			a += Long.parseLong(st.nextToken());
			b += Long.parseLong(st.nextToken());
			if(b >= 100) {
				a++;
				b -= 100;
			}
		}
		System.out.print(a + "." + String.format("%02d", b));
	}
}
