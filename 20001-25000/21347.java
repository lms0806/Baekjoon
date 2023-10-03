import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine() + " ", b = br.readLine() + " ";
		
		int idx = 0;
		HashSet<Character> set = new HashSet<>();
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == b.charAt(idx)) {
				idx++;
			}
			else {
				set.add(b.charAt(idx));
				idx++;
				i--;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(Character c : set) {
			sb.append(c);
		}
		System.out.print(sb);
	}
}
