import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		char[] ch = br.readLine().toCharArray();
		int answer = 0;
		for(int i = 0; i < ch.length / 2; i++) {
			if(ch[i] != ch[ch.length - 1 - i]) {
				answer++;
			}
		}
		
		System.out.print(answer);
	}
}
