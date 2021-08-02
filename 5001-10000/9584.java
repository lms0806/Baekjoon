import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s = br.readLine();
		
		int size = Integer.parseInt(br.readLine());
		
		int answer = 0;
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			String str = solve(s, br.readLine());
			
			sb.append(str);
			if(str.length() != 0) {
				sb.append("\n");
				answer++;
			}
		}
		System.out.print(answer + "\n" + sb);
	}
	
	public static String solve(String a, String b) {
		
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == '*') {
				continue;
			}
			
			if(a.charAt(i) != b.charAt(i)) {
				return "";
			}
		}
		
		return b;
	}
}
