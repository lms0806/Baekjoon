import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(char ch : br.readLine().toCharArray()) {
			if(ch != 'J' && ch != 'A' && ch != 'V') {
				sb.append(ch);
			}
		}
		System.out.print(sb.length() == 0 ? "nojava" : sb);
	}
}
