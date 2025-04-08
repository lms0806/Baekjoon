import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		String[] str = new String[2];
		for(int i = 0; i < 2; i++) {
			str[i] = br.readLine() + ".";
		}
		
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str[0].length(); i++) {
			if(str[0].charAt(i) == '.' && str[1].charAt(i) == '.') {
				sb.append(count == 1 ? 'v' : 'w');
				count = 0;
			}
			else if(str[0].charAt(i) == '/' && str[1].charAt(i) == '.') {
				count++;
			}
		}
		System.out.print(sb);
	}
}
