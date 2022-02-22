import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		st.nextToken();
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		char[][] ch = new char[h][];
		for(int i = 0; i < h; i++) {
			ch[i] = br.readLine().toCharArray();
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < ch[0].length; i += w) {
			sb.append(solve(ch, i, h, w));
		}
		System.out.print(sb);
	}
	
	public static char solve(char[][] ch, int i, int h, int w) {
		for(int j = 0; j < h; j++) {
			for(int k = i; k < i + w; k++) {
				if(ch[j][k] != '?') {
					return ch[j][k];
				}
			}
		}
		return '?';
	}
}
