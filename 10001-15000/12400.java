import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		char[] alpha = new char[26];
		
		String a = "abcdefgjpsykxnmrihwvotulqz";
		String b = "yhesocvurnaimbltdxfpkwjgzq";
		
		for(int i = 0; i < a.length(); i++) {
			alpha[a.charAt(i) - 'a'] = b.charAt(i);
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			sb.append("Case #").append(i).append(": ");
			
			for(char c : br.readLine().toCharArray()) {
				sb.append(c == ' ' ? c : alpha[c - 'a']);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
