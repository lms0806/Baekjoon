import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		System.out.print(Math.min(stol(br.readLine()), stol(br.readLine())));
	}
	
	public static long stol(String s) {
		return Long.parseLong(s.replaceAll(" ", ""));
	}
}
