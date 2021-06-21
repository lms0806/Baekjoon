import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		String str = br.readLine();
		
		int answer = 0;
		for(int i = 0; i < str.length() - 3; i++) {
			if(str.charAt(i) == 'p' && str.charAt(i+1) == 'P' && str.charAt(i+2) == 'A' && str.charAt(i+3) == 'p') {
				answer++;
				i+=3;
			}
		}
		System.out.print(answer);
	}
}
