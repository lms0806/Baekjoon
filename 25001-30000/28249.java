import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int answer = 0;
		while(t --> 0) {
			String s = br.readLine();
			
			answer += s.equals("Poblano") ? 1500 : s.equals("Mirasol") ? 6000 : s.equals("Serrano") ? 15500 : s.equals("Cayenne") ? 40000 : s.equals("Thai") ? 75000 : 125000;
		}
		System.out.print(answer);
	}
}
