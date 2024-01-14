import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(":");
		int h = Integer.parseInt(str[0]), m = Integer.parseInt(str[1]);
		
		int n = Integer.parseInt(br.readLine());
		
		int count = 0;
		while(count < n) {
			if(m == 15 || m == 30 || m == 45) {
				count++;
			}
			if(m == 0) {
				count += h;
			}
			
			if(count >= n) {
				break;
			}
			
			m++;
			
			if(m >= 60) {
				h++;
				m -= 60;
			}
			
			if(h > 12) {
				h -= 12;
			}
		}
		
		System.out.printf("%02d:%02d", h, m);
	}
}
