import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int d = 0, p = 0;
		while(t --> 0) {
			
			if(br.readLine().charAt(0) == 'D') {
				d++;
			}
			else {
				p++;
			}
			
			if(Math.abs(d - p) >= 2) {
				break;
			}
		}
		System.out.print(d + ":" + p);
	}
}
