import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int count = 0;
		while(n --> 0) {
			String s = br.readLine();
			
			count += s.equals("A") ? 1 : -1;

			if(count < 0) {
				break;
			}
		}
		
		System.out.print(count == 0 ? "YES" : "NO");
	}
}
