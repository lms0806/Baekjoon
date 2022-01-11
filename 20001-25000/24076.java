import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		br.readLine();
		
		String s = br.readLine();
		
		int answer = 0;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(i % 2 == 0) {
				if(c != 'I') {
					answer++;
				}
			}
			else {
				if(c != 'O') {
					answer++;
				}
			}
		}
		System.out.print(answer);
	}
}
