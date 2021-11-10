import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String[] s = br.readLine().split(" ");
			
			if(s[0].equals("0")) {
				break;
			}
			
			int leaf = 1;
			for(int i = 1; i < s.length; i += 2) {
				leaf *= Integer.parseInt(s[i]);
				leaf -= Integer.parseInt(s[i + 1]);
			}
			sb.append(leaf).append("\n");
		}
		System.out.print(sb);
	}
}
