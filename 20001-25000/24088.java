import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		br.readLine();
		int k = Integer.parseInt(br.readLine());
		
		for(char c : br.readLine().toCharArray()) {
			if(c == 'R') {
				k--;
			}
		}
		
		System.out.print(k <= 0 ? "W" : "R");
	}
}
