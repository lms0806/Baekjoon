import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a1 = Integer.parseInt(br.readLine()), a2 = Integer.parseInt(br.readLine()), a3 = Integer.parseInt(br.readLine());
		
		System.out.print(Math.min(a2 * 2 + a3 * 4, Math.min(a1 * 2 + a3 * 2, a1 * 4 + a2 * 2)));
	}
}
