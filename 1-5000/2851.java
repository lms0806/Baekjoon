import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = 0, num = 0;
		for(int i = 0; i < 10; i++) {
			num = Integer.parseInt(br.readLine());
			
			n += num;
			
			if(n > 100) {
				break;
			}
		}
		
		System.out.print(Math.abs(n - 100) > Math.abs(100 + num - n) ? n - num : n);
	}
}
