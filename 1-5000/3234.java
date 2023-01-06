import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		br.readLine();
		int x = 0, y = 0;
		
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		if(check(0, 0, n, m)) {
			sb.append(0).append("\n");
		}
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(c == 'I') {
				x++;
			}
			else if(c == 'Z') {
				x--;
			}
			else if(c == 'S') {
				y++;
			}
			else if(c == 'J') {
				y--;
			}
				
			if(check(x, y, n, m)) {
				sb.append(i + 1).append("\n");
			}
		}
		System.out.print(sb.toString().equals("") ? -1 : sb);
	}
	
	public static boolean check(int x, int y, int n, int m) {
		if(Math.abs(x - n) + Math.abs(y - m) <= 1 || (Math.abs(x - n) == 1 && Math.abs(y - m) == 1)) {
			return true;
		}
		return false;
	}
}
