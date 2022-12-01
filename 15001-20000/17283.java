import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int l = Integer.parseInt(br.readLine()), r = Integer.parseInt(br.readLine());
		
		int num = 0;
		int answer = 0, mul = 2;
		while(true) {
			num = l * r / 100;
			
			if(num <= 5) {
				break;
			}
			
			l = num;
			
			answer += mul * num;
			mul *= 2;
		}
		
		System.out.print(answer);
	}
}
