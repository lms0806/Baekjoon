import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		
		char[][] ch = new char[s.length() / n][n];
		
		int idx = 0;
		for(int i = 0; i < ch.length; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < n; j++) {
					ch[i][j] = s.charAt(idx);
					idx++;
				}
			}
			else {
				for(int j = n - 1; j >= 0; j--) {
					ch[i][j] = s.charAt(idx);
					idx++;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < ch.length; j++) {
				sb.append(ch[j][i]);
			}
		}
		System.out.print(sb);
	}
}
