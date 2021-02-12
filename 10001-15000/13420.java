import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			String[] str = br.readLine().split(" ");
			long num = Long.parseLong(str[0]);
			long num1 = Long.parseLong(str[2]);
			long result = Long.parseLong(str[4]);
			
			if(str[1].equals("+")) {
				sb.append(num + num1 == result? "correct" : "wrong answer");
			}
			else if(str[1].equals("-")) {
				sb.append(num - num1 == result? "correct" : "wrong answer");
			}
			else if(str[1].equals("*")) {
				sb.append(num * num1 == result? "correct" : "wrong answer");
			}
			else if(str[1].equals("/")) {
				sb.append(num / num1 == result? "correct" : "wrong answer");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
