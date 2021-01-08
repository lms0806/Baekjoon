import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int answer = Integer.parseInt(br.readLine());
		String str = "";
		
		while(true) {
			str = br.readLine();
			if(str.equals("=")) {
				break;
			}
			
			if(str.equals("+")) {
				answer += Integer.parseInt(br.readLine());
			}
			else if(str.equals("-")) {
				answer -= Integer.parseInt(br.readLine());
			}
			else if(str.equals("*")) {
				answer *= Integer.parseInt(br.readLine());
			}
			else if(str.equals("/")) {
				answer /= Integer.parseInt(br.readLine());
			}
		}
		System.out.println(answer);
	}
}
