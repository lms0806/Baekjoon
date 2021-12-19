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
				char c = str.charAt(i);
				if(alpha[c - 'a'] && c != str.charAt(i-1)) {
					istrue = false;
					break;
				}
				if(!alpha[c - 'a']) {
					alpha[c - 'a'] = true;
				}
			}
			answer += istrue ? 1 : 0;
		}
		System.out.print(answer);
	}
}
