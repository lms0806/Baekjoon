import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] number = {3, 2, 0, 2};
		
		int answer = 0;
		for(int i = 2023; i <= n; i++) {
			int num = i, idx = 0;
			
			while(num != 0) {
				if(num % 10 == number[idx]) {
					idx++;
					
					if(idx == 4) {
						answer++;
						break;
					}
				}
				
				num /= 10;
			}
		}
		
		System.out.print(answer);
	}
}
