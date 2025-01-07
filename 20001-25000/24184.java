import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		String[] str = br.readLine().split(" ");
		
		StringBuilder sb = new StringBuilder();
		for(int i = str.length - 1; i >= 0; i--) {
			char[] ch = str[i].toCharArray();
			for(int j = ch.length - 1; j >= 0; j--) {
				if(check(ch[j]) && j < ch.length - 2 && !check(ch[j + 1]) && !check(ch[j + 2])) {
					continue;
				}
				sb.append(ch[j]);
			}
			sb.append(" ");
		}
		System.out.print(sb);
	}
	
	public static boolean check(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y';
	}
}
