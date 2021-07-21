import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		String str = "";
		StringBuilder sb = new StringBuilder();
		while(!(str = br.readLine()).equals("0")) {
			int answer = 1;
			
			for(char ch : str.toCharArray()) {
				answer += ch == '0' ? 4 : ch == '1' ? 2 : 3;
				answer++;
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
