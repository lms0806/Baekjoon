import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < 10; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
			
			int count = 6 - x;
			
			a += x * 3;
			b += x * 3;
			
			if(count > 0) {
				b += y <= count ? y * 3 : count * 3;
			}
			
			n++;
			if(n == 8) {
				break;
			}
		}
		System.out.print(a >= 66 && b >= 130 ? "Nice" : "Nae ga wae");
	}
}
