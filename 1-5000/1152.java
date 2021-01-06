import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = br.readLine().trim();
		int count = 0;
		
		if(str.equals("")) {
			count = 0;
		}
		else {
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == ' ') {
					count++;
				}
			}
			count++;
		}
		
		System.out.println(count);
	}
}
