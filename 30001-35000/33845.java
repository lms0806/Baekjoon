import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashSet<Character> set = new HashSet<>();
		for(char c : br.readLine().toCharArray()) {
			set.add(c);
		}
		
		StringBuilder sb = new StringBuilder();
		for(char c : br.readLine().toCharArray()) {
			if(!set.contains(c)) {
				sb.append(c);
			}
		}
		System.out.print(sb);
	}
}
