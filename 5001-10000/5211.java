import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int a = 0, c = 0;
		String str = br.readLine();
		for(String s : str.split("\\|")) {
			char ch = s.charAt(0);
			
			if(ch == 'A' || ch == 'D' || ch == 'E') {
				a++;
			}
			else if(ch == 'C' || ch == 'F' || ch == 'G') {
				c++;
			}
		}
		
		if(a == c) {
			char ch = str.charAt(str.length() - 1);
			
			if(ch == 'A' || ch == 'D' || ch == 'E') {
				a++;
			}
			else if(ch == 'C' || ch == 'F' || ch == 'G') {
				c++;
			}
		}
		
		System.out.print(a > c ? "A-minor" : "C-major");
	}
}
