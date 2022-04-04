import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		String answer = "S";
		int max = 0;
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			if(max == 0) {
				max = n;
			}
			
			if(max < n) {
				answer = "N";
				break;
			}
		}
		System.out.print(answer);
	}	
}
