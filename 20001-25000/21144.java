import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine()) + 1;
		String a = br.readLine();
		
		while(size --> 1) {
			String s = Integer.toString(size);
			
			if(a.endsWith(s)) {
				a = a.substring(0, a.length() - s.length());
			}
			else {
				break;
			}
		}
		System.out.print(size);
	}
}
