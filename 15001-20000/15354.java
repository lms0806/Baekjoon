import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		char c = br.readLine().charAt(0);
		int answer= 2;
		while(n --> 1) {
			char ch = br.readLine().charAt(0);
			if(c != ch) {
				c = ch;
				answer++;
			}
		}
		System.out.print(answer);
	}
}
