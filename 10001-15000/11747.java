import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		String s = "";
		
		int count = 0;
		while(count != n) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			while(st.hasMoreTokens()) {
				s += st.nextToken();
				count++;
			}
		}
		
		int answer = 0;
		while(true) {
			if(!s.contains(String.valueOf(answer))) {
				break;
			}
			
			answer++;
		}
		
		System.out.print(answer);
	}
}
