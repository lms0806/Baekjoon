import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int a = 0, b = 0;
		while(size --> 0) {
			if(Integer.parseInt(br.readLine()) == 1) {
				a++;
			}
			else {
				b++;
			}
		}
		
		System.out.print(Math.min(a, b));
	}
}
