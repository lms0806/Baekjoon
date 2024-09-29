import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		System.out.print(s.equals("(1)") ? 0 : s.equals(")1(") ? 2 : 1);
	}
}
