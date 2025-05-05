import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s = br.readLine();
		
		int count = 0;
		for(char c : s.toCharArray()) {
			if(c == 'a') {
				count++;
			}
		}
		
		int answer = Integer.MAX_VALUE;
		for(int i = 0; i < s.length(); i++) {
			int num = 0;
			for(int j = i; j < count + i; j++) {
				if(s.charAt(j % s.length()) == 'b') {
					num++;
				}
			}
			answer = Math.min(answer, num);
		}
		System.out.print(answer);
	}
}
