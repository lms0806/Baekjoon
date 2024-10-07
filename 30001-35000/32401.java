import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		String s = br.readLine();
		
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != 'A') {
				continue;
			}
			
			int n = 0;
			int j = i + 1;
			for(; j < s.length(); j++) {
				if(s.charAt(j) == 'A') {
					if(n == 1) {
						count++;
					}
					break;
				}
				
				if(s.charAt(j) == 'N') {
					n++;
				}
			}
			
			i = j - 1;
		}
		System.out.print(count);
	}
}
