import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		int sum = 0,bonus = 0;
		for(int i = 0; i < size; i++) {
			if(str.charAt(i) == 'O') {
				sum += i + 1 + bonus;
				bonus++;
			}
			else {
				bonus = 0;
			}
		}
		
		System.out.print(sum);
	}
}
