import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		br.readLine();
		String s = br.readLine();
		
		while(true) {
			if(s.contains("PS4")) {
				s = s.substring(0, s.indexOf("PS4") + 2) + s.substring(s.indexOf("PS4") + 3);
			}
			else if(s.contains("PS5")) {
				s = s.substring(0, s.indexOf("PS5") + 2) + s.substring(s.indexOf("PS5") + 3);
			}
			else {
				break;
			}
		}
		System.out.print(s);
	}
}
