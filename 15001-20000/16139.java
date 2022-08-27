import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		int[][] alpha = new int[26][s.length() + 1];
		
		for(int i = 0; i < s.length(); i++) {
			alpha[s.charAt(i) - 'a'][i + 1] = 1;
		}
		
		for(int i = 1; i < s.length(); i++) {
			for(int j = 0; j < 26; j++) {
				alpha[j][i + 1] += alpha[j][i];
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int c = st.nextToken().charAt(0) - 'a';
			int start = Integer.parseInt(st.nextToken()), end = Integer.parseInt(st.nextToken());
			
			sb.append(alpha[c][end + 1] - alpha[c][start]).append("\n");
		}
		System.out.print(sb);
	}
}
