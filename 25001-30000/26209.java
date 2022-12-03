import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String answer = "S";
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 8; i++) {
			int n = Integer.parseInt(st.nextToken());
			
			if(n != 0 && n != 1) {
				answer = "F";
				break;
			}
		}
		
		System.out.print(answer);
	}
}
