import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		String str = br.readLine();
		
		char[] mbti = {'I','N','F','P','E','S','T','J'};
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			sb.append(str.charAt(i) != mbti[i] ? mbti[i] : mbti[i+4]);
		}	
		System.out.print(sb);
	}
}
