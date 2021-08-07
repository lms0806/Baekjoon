import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		String[] str = new String[size];
		
		for(int i = 0; i < str.length; i++) {
			str[i] = br.readLine();
		}
		
		StringBuilder sb = new StringBuilder();
		for(String ss : str) {
			String s = new StringBuilder(ss).reverse().toString();
			for(String sss : str) {
				if(s.equals(sss)) {
					sb.append(s.length()).append(" ").append(s.charAt(s.length() / 2));
					break;
				}
			}
			if(sb.length() != 0) {
				break;
			}
		}
		System.out.print(sb);
	}
}
