import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = br.readLine();
		
		String a = "", b= "";
		if(str.length() > 2) {
			if(str.charAt(str.length()-1) == '0') {
				for(int i = 0; i < str.length() - 2; i++) {
					a += str.charAt(i);
				}
				b = b + str.charAt(str.length() - 2) + str.charAt(str.length() - 1);
			}
			else {
				for(int i = 0; i < str.length()-1; i++) {
					a += str.charAt(i);
				}
				b += str.charAt(str.length() - 1);
			}
		}
		else {
			a += str.charAt(0);
			b += str.charAt(1);
		}
		
		System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
	}
}
