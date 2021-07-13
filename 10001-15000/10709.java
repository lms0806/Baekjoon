import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		char[][] ch = new char[a][b];
		
		for(int i = 0; i < a; i++) {
			ch[i] = br.readLine().toCharArray();
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < a; i++) {
			boolean istrue = false;
			int count = 1;
			for(int j = 0; j < b; j++) {
				if(ch[i][j] == '.') {
					sb.append(istrue ? count : -1);
					if(istrue) {
						count++;
					}
				}
				else if(ch[i][j] == 'c') {
					sb.append(0);
					istrue = true;
					count = 1;
				}
				sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
