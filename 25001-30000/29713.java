import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] alpha = new int[26];
		
		br.readLine();
		
		for(char c : br.readLine().toCharArray()) {
			alpha[c - 'A']++;
		}
		
		int answer = Integer.MAX_VALUE;
		for(char c : "BONZSILVER".toCharArray()) {
			answer = Math.min(answer, alpha[c - 'A'] / (c == 'E' || c == 'R' ? 2 : 1));
		}
		System.out.print(answer);
	}
}
