import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int answer = 0;
		while(size --> 0) {
			String str = br.readLine();
			
			boolean[] alpha = new boolean[26];
			
			alpha[str.charAt(0) - 'a'] = true;
			boolean istrue = true;
			for(int i = 1; i < str.length(); i++) {
				if(alpha[str.charAt(i) - 'a'] && str.charAt(i) != str.charAt(i-1)) {
					istrue = false;
					break;
				}
				if(!alpha[str.charAt(i)-'a']) {
					alpha[str.charAt(i)-'a'] = true;
				}
			}
			answer += istrue ? 1 : 0;
		}
		System.out.print(answer);
	}
}
