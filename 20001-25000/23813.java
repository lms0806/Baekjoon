import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s = br.readLine();
		
		String str = s.substring(s.length() - 1) + s.substring(0, s.length() - 1);
		long sum = Long.parseLong(s);
		
		while(!s.equals(str)) {
			sum += Long.parseLong(str);
			str = str.substring(s.length() - 1) + str.substring(0, s.length() - 1);
		}
		System.out.print(sum);
	}
}
