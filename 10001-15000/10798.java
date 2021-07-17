import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String[] str = new String[5];
		
		for(int i = 0; i < 5; i++) {
			str[i] = br.readLine();
		}
		
		int maxsize = 0;
		for(int i = 0; i < 5; i++) {
			maxsize = Math.max(maxsize, str[i].length());
		}
		
		StringBuilder sb  = new StringBuilder();
		for(int i = 0; i < maxsize; i++) {
			for(int j = 0; j < 5; j++) {
				if(str[j].length() > i) {
					sb.append(str[j].charAt(i));
				}
			}
		}
		System.out.print(sb);
	}
}
