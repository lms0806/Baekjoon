import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		br.readLine();
		
		int[] alpha = new int[26];
		for(char c : br.readLine().toCharArray()) {
			alpha[c - 'a']++;
		}
		
		System.out.print(Math.min(alpha[2], Math.min(alpha[14], Math.min(alpha[15], Math.min(alpha[18], alpha[20])))));
	}
}
