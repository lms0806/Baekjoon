import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		for(char c : br.readLine().toCharArray()) {
			sb.append(c == 'a' ? '4' : c == 'e' ? '3' : c == 'i' ? '1' : c == 'o' ? '0' : c == 's' ? '5' : c);
		}
		System.out.print(sb);
	}
}
