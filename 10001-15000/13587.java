import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		for(char c : br.readLine().toCharArray()) {
			if("aeiou".contains(c + "")) {
				sb.append(c);
			}
		}
		
		System.out.print(sb.toString().equals(new StringBuilder(sb).reverse().toString()) ? "S" : "N");
	}
}
