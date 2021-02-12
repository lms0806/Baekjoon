import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int a = 0;
		
		int sum = 0, num = 0;
		for(int i = 0; i < 4; i++) {
			a = Integer.parseInt(br.readLine());
			if(i == 0) {
				num = a;
			}
			else if(a > num) {
				sum += a;
			}
			else {
				sum += num;
				num = a;
			}
		}
		
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		sum += b>c ? b : c;

		System.out.print(sum);
	}
}
