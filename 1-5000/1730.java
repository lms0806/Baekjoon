import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());

		boolean[][] sero = new boolean[size][size];
		boolean[][] karo = new boolean[size][size];
		
		int x = 0, y = 0;
		char s;
		String str = br.readLine();
		for(int i = 0; i < str.length(); i++) {
			s = str.charAt(i);
			if(s == 'U') {
				if(check(x-1,y,size)) {
					sero[x][y] = true;
					sero[--x][y] = true;
				}
			}
			else if(s == 'D') {
				if(check(x+1,y,size)) {
					sero[x][y] = true;
					sero[++x][y] = true;
				}
			}
			else if(s == 'R') {
				if(check(x,y+1,size)) {
					karo[x][y] = true;
					karo[x][++y] = true;
				}
			}
			else{
				if(check(x,y-1,size)) {
					karo[x][y] = true;
					karo[x][--y] = true;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(sero[i][j] && karo[i][j]) {
					sb.append("+");
				}
				else if(sero[i][j]) {
					sb.append("|");
				}
				else if(karo[i][j]) {
					sb.append("-");
				}
				else {
					sb.append(".");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
	public static boolean check(int x, int y, int size) {
		if(x < 0 || x >= size || y < 0 || y >= size) {
			return false;
		}
		return true;
	}
}
