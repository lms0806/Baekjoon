import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static String[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] alpha = new int[2][26];
		
		int n = Integer.parseInt(br.readLine());
		
		while(n --> 0) {
			for(char ch : br.readLine().toCharArray()) {
				if(ch != ' ') {
					if(ch >= 'a' && ch <= 'z') {
						alpha[0][ch - 'a']++;
					}
					else {
						alpha[1][ch - 'A']++;
					}
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < alpha[i].length; j++) {
				if(alpha[i][j] != 0) {
					sb.append(i == 0 ? (char)(j + 'a') : (char)(j + 'A')).append(" ").append(alpha[i][j]).append("\n");
				}
			}
		}
		System.out.print(sb);
	}
}
