import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[][] ch = {{'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'p'}, {'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'l'}, {'Z', 'X', 'C', 'V', 'B', 'N', 'M', 'm'}};
		
		StringBuilder sb = new StringBuilder();
		for(char c : br.readLine().toCharArray()) {
			if(c >= 'A' && c <= 'Z') {
				boolean flag = false;
				for(int i = 0; i < ch.length; i++) {
					for(int j = 0; j < ch[i].length; j++) {
						if(c == ch[i][j]) {
							sb.append(ch[i][j + 1]);
							flag = true;
							break;
						}
					}
					
					if(flag) {
						break;
					}
				}
			}
			else {
				sb.append(c);
			}
		}
		System.out.print(sb);
	}
}
