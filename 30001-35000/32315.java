import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashSet<Character> set = new HashSet<>();
		
		for(char c : br.readLine().replaceAll("-", "").toCharArray()) {
			set.add(c);
		}
		
		System.out.print(set.size());
	}
}
