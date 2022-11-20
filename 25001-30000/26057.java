import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int l = Integer.parseInt(br.readLine()), t = Integer.parseInt(br.readLine());
		
		System.out.print(Math.max(l - t, t) - Math.min(l - t, t));
	}
}
