import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int num = Integer.parseInt(br.readLine());
		int count = 1;
		
		while(num != 1) {
			if(num%2 == 0) {
				num/=2;
			}
			else if(num%2 == 1) {
				num*=3;
				num++;
			}
			count++;
		}
		
		System.out.println(count);
	}
}
