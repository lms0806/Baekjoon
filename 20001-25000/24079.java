import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int xy = Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine());
		int z = Integer.parseInt(br.readLine());
		
		System.out.print(xy <= z ? 1 : 0);
	}
}
