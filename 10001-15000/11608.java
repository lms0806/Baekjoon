import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] alpha = new int[26];
		
		for(char ch : br.readLine().toCharArray()) {
			alpha[ch - 'a']++;
		}
		
		Arrays.sort(alpha);
		
		int answer = 0;
		for(int i = 0; i < 24; i++) {
			answer += alpha[i];
		}
		
		System.out.print(answer);
	}
}
