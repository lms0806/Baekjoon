import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int a = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) {
				sum+=i;
			}
		}
		
		sum *= 5;
		sum -= 24;
		System.out.println(sum);
	}
}
