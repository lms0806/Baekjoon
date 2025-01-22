import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		int[] alpha = new int[26];
		for(char c : br.readLine().toCharArray()) {
			alpha[c - 'a']--;
		}
		
		for(char c : br.readLine().toCharArray()) {
			alpha[c - 'a']++;
		}
		
		int answer = 0;
		for(int a : alpha) {
			if(a > 0) {
				answer += a;
			}
		}
		System.out.print(answer);
	}
}
