import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
		
		int h = 0, m = 0, s = -(c * (n - 1));
		for(int i = 0; i < n; i++) {
			String[] str = br.readLine().split(":");
			
			m += Integer.parseInt(str[0]);
			s += Integer.parseInt(str[1]);
		}
		
		if(s < 0) {
			m--;
			s += 60;
		}
		
		if(s >= 60) {
			m += s / 60;
			s %= 60;
		}
		if(m >= 60) {
			h += m / 60;
			m %= 60;
		}
		
		System.out.print(format(h) + ":" + format(m) + ":" + format(s));
	}
	
	public static String format(int n) {
		return String.format("%02d", n);
	}
}
