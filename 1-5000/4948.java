import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int a = 1;
		
		while(a != 0) {
			int answer = 0, count = 0;
			a = Integer.parseInt(br.readLine());
			if(a == 0) {
				break;
			}
			for(int i = a+1; i <= 2*a; i++) {
				for(int j = 2; j < (int)Math.sqrt(i)+1; j++) {
					if(i % j == 0) {
						count++;
						break;
					}
				}
				if(count == 0) {
					answer++;
				}
				count = 0;
			}
			System.out.println(answer);
		}
	}
}
