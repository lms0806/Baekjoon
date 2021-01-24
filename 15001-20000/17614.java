import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int num = Integer.parseInt(br.readLine());
		
		int answer = 0, number;
		for(int i = 1; i <= num; i++) {
			String str = Integer.toString(i);
			for(int j = 0; j < str.length(); j++) {
				number = str.charAt(j)-'0';
				if(number % 3 == 0 && number != 0) {
					answer++;
				}
			}
		}
	
		System.out.println(answer);
	}
}
