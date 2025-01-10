import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] ch = br.readLine().toCharArray();
		
		int answer = Integer.parseInt(br.readLine());
		for(int i = 0; i < answer; i++) {
			char[] c = br.readLine().toCharArray();
			
			if(c.length != ch.length) {
				continue;
			}
			
			int count = 0;
			for(int j = 0; j < c.length; j++) {
				if(c[j] != ch[j]) {
					count++;
				}
			}
			
			if(count == 1) {
				answer = i + 1;
				break;
			}
		}
		System.out.print(answer);
	}
}
