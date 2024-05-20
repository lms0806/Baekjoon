import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int robot = 0, box = 0, arrive = 0;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(c == '@') {
				robot = i;
			}
			else if(c == '#') {
				box = i;
			}
			else if(c == '!') {
				arrive = i;
			}
		}
		
		System.out.print((robot < box && box < arrive) || (arrive < box && box < robot) ? Math.abs(arrive - robot) - 1 : -1);
	}
}
