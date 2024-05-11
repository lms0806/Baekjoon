import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		while(n --> 0) {
			String s = br.readLine();
			
			int upper = 0, lower = 0;
			for(char c : s.toCharArray()) {
				if('a' <= c && c <= 'z') {
					lower++;
				}
				else if('A' <= c && c <= 'Z') {
					upper++;
				}
			}
			if(upper > lower) {
				continue;
			}
			
			if(s.length() > 10) {
				continue;
			}
			
			if(s.replaceAll("[0-9]", "").equals("")) {
				continue;
			}
			
			System.out.print(s);
			break;
		}
	}
}
