import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		br.readLine();
		String str = br.readLine();
		
		int count = 1;
		if(!str.contains("LL")) {
			count = str.length();
		}
		else {
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == 'L') {
					i++;
				}
				count++;
			}
		}
		
		System.out.print(count);
	}
}
