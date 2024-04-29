import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashSet<Character> set = new HashSet<>();
		for(int i = 0; i < 3; i++) {
			set.add(br.readLine().charAt(0));
		}
		
		System.out.print(set.contains('l') && set.contains('k') && set.contains('p') ? "GLOBAL" : "PONIX");
	}
}
