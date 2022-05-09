import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int size = Integer.parseInt(br.readLine());
			String[] str = new String[size];
			
			for(int i = 0; i < size; i++) {
				str[i] = br.readLine();
			}
			sb.append(solve(str)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(String[] str) {
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < str.length; j++) {
				if(i == j) {
					continue;
				}
				
				if(check(str[i] + str[j])) {
					return str[i] + str[j];
				}
			}
		}
		return "0";
	}
	
	public static boolean check(String s) {
		for(int i = 0; i < s.length() / 2; i++) {
			if(s.charAt(i) != s.charAt(s.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
