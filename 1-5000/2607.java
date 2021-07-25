import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
	
		int[] alpha = new int[26];
		
		String str = br.readLine();
		for(char c : str.toCharArray()) {
			alpha[c - 'A']++;
		}
		
		int answer = 0;
		while(size --> 1) {
			int[] temp = alpha.clone();
			String s = br.readLine();
			
			int count = 0;
			for(char c : s.toCharArray()) {
				if(temp[c - 'A'] > 0) {
					count++;
					temp[c - 'A']--;
				}
			}
			
			if(str.length() - 1 == s.length() && s.length() == count) {
				answer++;
			}
			else if(str.length() == s.length() && (count == str.length() || count == str.length() - 1)) {
				answer++;
			}
			else if(str.length() + 1 == s.length() && count == str.length()){
				answer++;
			}
		}
		System.out.print(answer);
	}
}
