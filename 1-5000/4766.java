import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		double a, num = 0.0;
		num = Double.parseDouble(br.readLine());
		while(true) {
			a = Double.parseDouble(br.readLine());
			
			if(a == 999) {
				break;
			}
			
			System.out.println(String.format("%.2f", a-num));
			
			num = a;
		}
	}
}
