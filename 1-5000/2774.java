import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		for(char ch : br.readLine().toCharArray()) {
			sb.append(Character.isUpperCase(ch) ? Character.toString(ch).toLowerCase() : Character.toString(ch).toUpperCase());
		}
		System.out.print(sb);
	}
}
