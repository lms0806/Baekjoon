import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		int e = Integer.parseInt(br.readLine());
		
		int sum = 0;
		if(a < 0) {
			sum = Math.abs(a)*c + d + b*e;
		}
		else if(a == 0) {
			sum = d + b*e;
		}
		else {
			sum = (b-a)*e;
		}
		
		System.out.print(sum);
	}
}
