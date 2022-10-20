import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		if(!checkerror(str)) {
			sb.append("Error!");
		}
		else if(str.contains("_")) {
			String[] strs = str.split("_");
			
			sb.append(strs[0]);
			for(int i = 1; i < strs.length; i++) {
				sb.append((char)(strs[i].charAt(0) - 'a' + 'A')).append(strs[i].substring(1));
			}
		}
		else {
			for(int i = 0; i < str.length(); i++) {
				if(i > 0 && str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
					sb.append("_").append((char)(str.charAt(i) - 'A' + 'a'));
				}
				else {
					sb.append(str.charAt(i));
				}
			}
		}
		System.out.print(sb);
	}
	
	public static boolean checkerror(String s) {
		if(s.charAt(0) == '_' || s.charAt(s.length() - 1) == '_') {
			return false;
		}
		if(s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') {
			return false;
		}
		
		for(int i = 0; i < s.length() - 1; i++) {
			if(s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == '_') {
				return false;
			}
		}
		
		boolean underbar = false, bigalpha = false;
		for(char c : s.toCharArray()) {
			if(c == '_') {
				underbar = true;
			}
			if(c >= 'A' && c <= 'Z') {
				bigalpha = true;
			}
		}
		return underbar && bigalpha ? false : true;
	}
}
