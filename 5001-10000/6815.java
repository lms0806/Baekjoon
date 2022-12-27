import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine());
		
		int answer = 0;
		for(int i = 1; i <= 100000000; i++) {
			int num = (int)Math.pow(i, 3);
			int sqrt = (int)Math.sqrt(num);
			
			if(num > b) {
				break;
			}
			
			if(Math.sqrt(num) == sqrt && num <= b && num >= a) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
