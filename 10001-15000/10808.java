import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		String str = br.readLine();
		
		int[] answer = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			answer[str.charAt(i) - 'a']++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < answer.length; i++) {
			sb.append(answer[i]).append(" ");
		}
		System.out.println(sb);
	}
}
