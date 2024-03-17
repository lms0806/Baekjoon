import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		char[] ch = br.readLine().toCharArray();
		
		int answer = 0;
		for(int i = 0; i < ch.length / 2; i++) {
			char a = ch[i], b = ch[ch.length - i - 1];
			if(a != b) {
				answer++;
				
				if(a < b) {
					ch[ch.length - i - 1] = a;
				}
				else {
					ch[i] = b;
				}
			}
		}
		System.out.print(answer + "\n" + String.valueOf(ch));
	}
}
