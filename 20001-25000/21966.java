import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		br.readLine();
		
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		if(str.length() <= 25) {
			sb.append(str);
		}
		else {
			sb.append(!str.substring(12,str.length()-12).contains(".") ? str.substring(0,11) + "..." + str.substring(str.length()-11) : str.substring(0,9) + "......" + str.substring(str.length()-10));
		}
		System.out.print(sb);
	}
}
