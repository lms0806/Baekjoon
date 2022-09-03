import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine()), t = Integer.parseInt(br.readLine());
		
		long sum = x;
		while(t --> 0) {
			sum += x - Integer.parseInt(br.readLine());
		}
		
		System.out.print(sum);
	}
}
