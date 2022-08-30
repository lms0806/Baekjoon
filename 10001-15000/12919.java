import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	static int answer = 0;
	static ArrayList<String> arr = new ArrayList<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String a = br.readLine();
		
		dfs(a, new StringBuilder(br.readLine()));
		
		System.out.print(answer);
	}
	
	public static void dfs(String a, StringBuilder sb) {
		if(sb.toString().equals(a)) {
			answer = 1;
			return;
		}
		if(answer == 1) {
			return;
		}
		
		if(sb.length() <= a.length()) {
			return;
		}
		
		if(sb.charAt(sb.length() - 1) == 'A') {
			sb.setLength(sb.length() - 1);
			dfs(a, sb);
			sb.append("A");
		}
		
		if(sb.charAt(0) == 'B') {
			sb.reverse().setLength(sb.length() - 1);
			dfs(a, sb);
			sb.append("B").reverse();
		}
	}
}
