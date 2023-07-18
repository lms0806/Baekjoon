import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine());
		
		System.out.print(a * 50 - b * 10 + (a > b ? 500 : 0));
	}
}
