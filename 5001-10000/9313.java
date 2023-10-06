import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == -1) {
				break;
			}
			
			long answer = 0;
			for(int i = 0; i < 32; i++) {
				answer = (answer << 1) + (((n >> i) & 1) == 1 ? 1 : 0);
			}
			
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
