import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = br.readLine();
		
		char[] ch = "CAMBRIDGE".toCharArray();
		
		HashSet<Character> set = new HashSet<>();
		
		for(int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			if(!set.contains(str.charAt(i))) {
				sb.append(str.charAt(i));
			}
		}
		System.out.print(sb);
	}
}
