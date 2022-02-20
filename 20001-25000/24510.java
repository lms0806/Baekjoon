import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int answer = 0;
		while(t --> 0) {
			int n = 0;
			char[] c = br.readLine().toCharArray();
			
			for(int i = 0; i < c.length - 2; i++) {
				if(i < c.length - 2 && c[i] == 'f' && c[i + 1] == 'o' && c[i + 2] == 'r') {
					n++;
					i += 2;
				}
				
				if(i < c.length - 4 && c[i] == 'w' && c[i + 1] == 'h' && c[i + 2] == 'i' && c[i + 3] == 'l' && c[i + 4] == 'e') {
					n++;
					i += 4;
				}
			}
			answer = Math.max(answer, n);
		}
		System.out.print(answer);
	}
}
