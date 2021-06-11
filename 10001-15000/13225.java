import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			int answer = 0;
			for(int i = 1; i <= n; i++) {
				if(n % i == 0) {
					answer++;
				}
			}
			sb.append(n).append(" ").append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
