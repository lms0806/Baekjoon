import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			int answer = 0;
			for(char ch : br.readLine().toCharArray()) {
				if(ch == 'A' || ch == 'D' || ch == 'O' || ch == 'P' || ch == 'Q' || ch == 'R') {
					answer++;
				}
				else if(ch == 'B') {
					answer += 2;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
