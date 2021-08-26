import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int r = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
		int zr = Integer.parseInt(st.nextToken()), zc = Integer.parseInt(st.nextToken());
		
		char[][] ch = new char[r][c];
		for(int i = 0; i < r; i++) {
			ch[i] = br.readLine().toCharArray();
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < zr; j++) {
				for(int k = 0; k < c; k++) {
					for(int l = 0; l < zc; l++) {
						sb.append(ch[i][k]);
					}
				}
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}
