import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine().toLowerCase();
		
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		for(int i = 0; i < s.length() - 1; i++) {
			if(s.charAt(i) == 's' && s.charAt(i + 1) == 's') {
				sb.append("\n").append(s.substring(0, i) + "B" + s.substring(i + 2));
			}
		}
		System.out.print(sb);
	}
}
