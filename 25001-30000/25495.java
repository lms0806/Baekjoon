import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long answer = 2, num = 2;
		int check = Integer.parseInt(st.nextToken());
		for(int i = 1; i < n; i++) {
			int number = Integer.parseInt(st.nextToken());
			if(check != number) {
				check = number;
				num = 2;
			}
			else {
				num *= 2;
			}
			
			answer += num;
			
			if(answer >= 100) {
				answer = 0;
				num = 2;
				check = '0';
			}
		}
		System.out.print(answer);
	}
}
