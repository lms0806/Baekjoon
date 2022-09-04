import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine(), s1 = br.readLine();
		
		int count = 0;
		for(int i = 0; i < 4; i++) {
			if(s.charAt(i) == s1.charAt(i)) {
				count++;
			}
		}
		
		System.out.print((int)(Math.pow(2, 4 - count)));
	}
}
