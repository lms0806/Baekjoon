import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int min1 = 2000, min2 = 2000;
		for(int i = 0; i < 3; i++) {
			min1 = Math.min(min1, Integer.parseInt(br.readLine()));
		}
		for(int i = 0; i < 2; i++) {
			min2 = Math.min(min2, Integer.parseInt(br.readLine()));
		}
		
		System.out.println(min1 + min2 - 50);
	}
}
