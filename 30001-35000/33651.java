import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = {"U", "A", "P", "C"};
		
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		for(String st : str) {
			if(!s.contains(st)) {
				sb.append(st);
			}
		}
		System.out.print(sb);
	}
}
