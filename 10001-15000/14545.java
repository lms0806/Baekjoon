import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			int n = Integer.parseInt(br.readLine()) + 1;
			
			int answer = 0;
			while(n --> 1) {
				answer += n * n;
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
