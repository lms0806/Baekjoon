import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		char[][] str = new char[a][b];
		for(int i = 0; i < a; i++) {
			str[i] = br.readLine().toCharArray();
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < a*c; i++) {
			for(int j = 0; j < b; j++) {
				for(int k = 0; k < c; k++) {
					sb.append(str[i/c][j]);
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
