import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		char[] ch = br.readLine().toCharArray();
		
		Arrays.sort(ch);
		
		int sum = 0;
		for(char c : ch) {
			sum += c - '0';
		}
		
		System.out.print(ch[0] != '0' || sum % 3 != 0 ? -1 : new StringBuilder(new String(ch)).reverse());
	}
}
