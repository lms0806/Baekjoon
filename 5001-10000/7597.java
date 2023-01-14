import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("#")) {
				break;
			}
			
			int ansa = 0, ansb = 0;
			int a = 0, b = 0;
			for(char c : s.toCharArray()) {
				if(c == 'A') {
					a++;
				}
				else {
					b++;
				}
				
				if(Math.abs(a - b) >= 2 && (a >= 4 || b >= 4)) {
					if(a > b) {
						ansa++;
					}
					else {
						ansb++;
					}
					a = 0;
					b = 0;
				}
			}
			sb.append("A ").append(ansa).append(" B ").append(ansb).append("\n");
		}
		System.out.print(sb);
	}
}
