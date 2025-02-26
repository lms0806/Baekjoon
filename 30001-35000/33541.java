import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int answer = -1;
		for(int y = n + 1; y <= 9999; y++) {
			int a = y / 100, b = y % 100;
			
			if(y == Math.pow(a + b, 2)) {
				answer = y;
				break;
			}
		}
		System.out.print(answer);
	}
}
