import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int y = 2014, m = 4, d = 1 + Integer.parseInt(br.readLine());
		
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
		while(true) {
			if(m == 2 && d > 29 && ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)) {
				d -= 29;
				m++;
			}
			else if(d > days[m - 1]){
				d -= days[m - 1];
				m++;
			}
			else {
				break;
			}
			
			if(m > 12) {
				y++;
				m = 1;
			}
		}
		
		System.out.print(y + "-" + print(m) + "-" + print(d));
	}
	
	public static String print(int n) {
		return String.format("%02d", n);
	}
}
