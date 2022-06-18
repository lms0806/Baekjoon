import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int h = 0, block = 0;
		while(block <= n) {
			block += 2 * h * h + 2 * h + 1;
			h++;
		}
		
		System.out.print(h - 1);
	}
}
