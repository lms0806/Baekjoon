import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int num = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < num; i++) {
			String str = br.readLine();
			
			String answer = "YES";
			int count = 0;
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == '(') {
					count++;
				}
				else if(str.charAt(j) == ')') {
					if(count > 0) {
						count--;
					}
					else {
						answer = "NO";
						break;
					}
				}
			}
			
			if(count != 0) {
				answer = "NO";
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
