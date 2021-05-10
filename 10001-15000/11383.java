import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		char[][] str = new char[n][m];
		
		String s;
		for(int i = 0; i < str.length; i++) {
			s = br.readLine();
			str[i] = s.toCharArray();
		}
		
		boolean istrue = true;
		for(int i = 0; i < str.length; i++) {
			s = br.readLine();
			for(int j = 0; j < str[i].length * 2; j++) {
				if(str[i][j/2] != s.charAt(j)) {
					istrue = false;
					break;
				}
			}
		}
		
		System.out.print(istrue ? "Eyfa" : "Not Eyfa");
	}
}
