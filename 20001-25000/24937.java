import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		String s = "SciComLove";
		
		int n = Integer.parseInt(br.readLine()) % s.length();
		
		System.out.print(s.substring(n) + s.substring(0, n));
	}
}
