import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = br.readLine();
		
		int a = 0, b = 0;
		for(int i = 0; i < str.length()-2; i++) {
			if(str.substring(i, i+3).equals("JOI")) {
				a++;
			}
			else if(str.substring(i, i+3).equals("IOI")) {
				b++;
			}
		}
		
		System.out.print(a + "\n" + b);
	}
}
