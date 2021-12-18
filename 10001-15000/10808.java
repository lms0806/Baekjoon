import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] answer = new int[26];
		
		for(char c : br.readLine().toCharArray()) {
			answer[c - 'a']++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int a : answer) {
			sb.append(a).append(" ");
		}
		System.out.print(sb);
	}
}
