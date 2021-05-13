import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			String str = br.readLine().replace(" ", "");
			
			int answer = 0;
			for(int i = 0; i < str.length(); i++) {
				answer += str.charAt(i)-64;
			}
			
			sb.append(answer == 100 ? "PERFECT LIFE" : answer).append("\n");
		}
		System.out.print(sb);
	}
}
