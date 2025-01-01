import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int size = 0;
		StringBuilder sb = new StringBuilder();
		while((size = Integer.parseInt(br.readLine())) != 0) {
			String answer = null;
			
			for(int i = 0; i < size; i++) {
				String s = br.readLine();
				
				if(answer == null) {
					answer = s;
				}
				else {
					answer = answer.compareToIgnoreCase(s) >= 0 ? s : answer;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
