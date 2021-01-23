import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			int num = Integer.parseInt(br.readLine());
			
			int answer = 1;
			for(int j = 2; j <= num; j++) {
				answer *= j;
				while(answer % 10 == 0) {
					answer /= 10;
				}
				answer %= 1000;
			}
			sb.append(answer%10).append("\n");
		}
		System.out.println(sb);
	}
}
