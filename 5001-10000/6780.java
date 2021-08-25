import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine());
		
		int answer = 2;
		while(true) {
			int num = a - b;
			
			answer++;
			
			if(num > b) {
				break;
			}
			
			a = b;
			b = num;
		}
		System.out.print(answer);
	}
}
