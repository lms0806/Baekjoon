import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		boolean istrue = true;
		String str = br.readLine().toLowerCase();
		
		for(int j = 0; j < str.length()/2; j++) {
			if(str.charAt(j) != str.charAt(str.length() - j - 1)) {
				istrue = false;
				break;
			}
		}
		System.out.print(istrue ? "true" : "false");
	}
}
