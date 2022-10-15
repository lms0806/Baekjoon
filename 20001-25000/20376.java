import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		HashSet<String> set = new HashSet<>();
		
		String s;
		while((s = br.readLine()) != null) {
			set.add(s.substring(10));
		}
		System.out.print(set.size());
	}
}
