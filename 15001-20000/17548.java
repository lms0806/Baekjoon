import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		for(char ch : br.readLine().toCharArray()) {
			sb.append(ch == 'e' ? ch : "").append(ch);
		}
		System.out.print(sb);
	}
}
