import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		int t = Integer.parseInt(br.readLine()) + 1;
		
		int answer = 0;
		double num = 0;
		for(int i = 0; i < t; i++) {
			num += Double.parseDouble(br.readLine().substring(1)) * 100;
			
			if(i == 0) {
				continue;
			}
			
			if(num % 100 != 0) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
