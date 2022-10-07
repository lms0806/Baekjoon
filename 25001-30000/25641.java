import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		char[] ch = br.readLine().toCharArray();
		int num = 0;
		for(char c : ch) {
			num += c == 's' ? 1 : -1;
		}
		
		int idx = 0;
		while(num != 0) {
			num += ch[idx] == 's' ? -1 : 1;
			idx++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = idx; i < ch.length; i++) {
			sb.append(ch[i]);
		}
		System.out.print(sb);
	}
}
