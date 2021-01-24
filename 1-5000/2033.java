import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		long num = Long.parseLong(br.readLine());
		
		long ten = 10;
		while(num > ten) {
			if(num % ten < ten / 2) {
				num -= num % ten;
			}
			else {
				num -= num % ten;
				num += ten;
			}
			ten *= 10;
		}
		
		System.out.println(num);
	}
}
