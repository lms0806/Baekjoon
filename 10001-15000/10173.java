import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		char[] ch = {'n','e','m','o'};
		char[] ch2 = {'N','E','M','O'};
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String str = br.readLine();
			
			if(str.equals("EOI")) {
				break;
			}
			
			int count = 0, answer = 0;
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == ch[count] || str.charAt(i) == ch2[count]) {
					count++;
					if(count == 4) {
						sb.append("Found").append("\n");
						answer++;
						break;
					}
				}
				else {
					count = 0;
				}
			}
			if(answer == 0) {
				sb.append("Missing").append("\n");
			}
		}
		System.out.println(sb);
	}
}
