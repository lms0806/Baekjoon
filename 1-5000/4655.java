import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int answer = 1;
			
			double c = Double.parseDouble(br.readLine());
			
			if(c == 0) {
				break;
			}
			
			double length = 0;
			for(int i =1; ; i++) {
				length += 1.0 / (i + 1);
				if(length >= c) {
					answer = i;
					break;
				}
			}
			
			sb.append(answer).append(" card(s)").append("\n");
		}
		System.out.print(sb);
	}
}
