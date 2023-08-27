import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("#")) {
				break;
			}
			
			sb.append(solve(s)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(String s) {
		for(int i = 0; i < s.length(); i++) {
			String str = s.substring(0, i) + s.substring(i + 1);
			
			if(str.equals(new StringBuilder(str).reverse().toString())) {
				return str;
			}
		}
		return "not possible";
	}
}
